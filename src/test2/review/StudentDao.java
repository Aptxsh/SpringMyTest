package test2.review;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDao implements IStudentDao {

	@Override
	public List<Student> queryAll() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "张三", Gender.女, 18, "JAVA"));
		list.add(new Student(2, "李四", Gender.男, 20, "UI"));
		list.add(new Student(3, "王五", Gender.男, 22, "测试"));
		return list;
	}

}
