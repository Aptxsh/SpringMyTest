package test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import oracle.net.aso.s;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student findOne(Integer id) {
		String sql = "select S_NUMBER, S_NAME, S_GENDER, S_AGE, S_MAJOR from STUDENTS where S_NUMBER = ?";
		Object[] objects = { id };
		return jdbcTemplate.queryForObject(sql, objects, new StudentRowMapper());
	}

	public int add(Student student) {
		String sql = "insert into STUDENTS values(students_seq.nextval,?,?,?,?)";
		return jdbcTemplate.update(sql, student.getName(), student.getGender().toString(),
				student.getAge(), student.getMajor());
	}

	public int delete(Integer id) {
		String sql = "delete from STUDENTS where S_NUMBER = ?";
		return jdbcTemplate.update(sql, id);
	}

	public int update(Integer id, Student student) {
		String sql = "update STUDENTS set S_NAME = ?, S_GENDER = ?, S_AGE = ?, S_MAJOR = ? where S_NUMBER = ?";
		return jdbcTemplate.update(sql, student.getName(), student.getGender().toString(),
				student.getAge(), student.getMajor(), id);
	}

}
