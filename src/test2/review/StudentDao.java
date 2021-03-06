package test2.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao implements IStudentDao {

	@Autowired
	private DataSource dataSource;

	public StudentDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Student> queryAll() {
		List<Student> list = new ArrayList<Student>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select S_NUMBER, S_NAME, S_GENDER, S_AGE, S_MAJOR from STUDENTS";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int number = rs.getInt(1);
				String name = rs.getString(2);
				Gender gender = Gender.valueOf(rs.getString(3));
				int age = rs.getInt(4);
				String major = rs.getString(5);
				Student s = new Student(number, name, gender, age, major);
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

}
