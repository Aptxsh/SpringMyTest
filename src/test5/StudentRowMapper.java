package test5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Integer id = rs.getInt(1);
		String name = rs.getString(2);
		Gender gender = Gender.valueOf(rs.getString(3));
		Integer age = rs.getInt(4);
		String major = rs.getString(5);
		return new Student(id, name, gender, age, major);
	}

}
