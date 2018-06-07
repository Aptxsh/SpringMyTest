package test2.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 标记后spring会自动注册bean
public class StudentService implements IStudentService {

	@Autowired // 可以在字段上面做标记，也可以在构造器和setter上面标记，spring会自动分析
	private IStudentDao studentDao;

	public StudentService(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAll() {
		return studentDao.queryAll();
	}
}
