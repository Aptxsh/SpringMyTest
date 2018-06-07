package test2.review;

import java.util.List;

public class StudentService implements IStudentService {

	private IStudentDao studentDao;

	public StudentService(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAll() {
		return studentDao.queryAll();
	}
}
