package test2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> queryAll() {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "张三", 18, "C");
		Student s2 = new Student(1, "李四", 18, "JAVA");
		Student s3 = new Student(1, "王五", 18, "C++");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}

}
