package test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Student findOne(Integer id) {
		return studentDao.findOne(id);
	}

	public int add(Student student) {
		return studentDao.add(student);
	}

	public int delete(Integer id) {
		return studentDao.delete(id);
	}

	public int update(Integer id, Student student) {
		return studentDao.update(id, student);
	}

}
