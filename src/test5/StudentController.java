package test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public StudentController(StudentService studentService, BCryptPasswordEncoder passwordEncoder) {
		this.studentService = studentService;
		this.passwordEncoder = passwordEncoder;
	}

	public void findOne(Integer id) {
		Student s = studentService.findOne(id);
		System.out.println("序号\t姓名\t性别\t年龄\t专业\t");
		System.out.println(String.format("%s\t%s\t%s\t%s\t%s", s.getId(), s.getName(),
				s.getGender(), s.getAge(), s.getMajor()));
	}

	public void add(Student student) {
		int num = studentService.add(student);
		if (num == 1) {
			System.out.println("添加成功");
		}
	}

	public void delete(Integer id) {
		int num = studentService.delete(id);
		if (num == 1) {
			System.out.println("删除成功");
		}
	}

	public void update(Integer id, Student student) {
		int num = studentService.update(id, student);
		if (num == 1) {
			System.out.println("修改成功");
		}
	}

	public void password(String pwd) {
		String password = passwordEncoder.encode(pwd);
		System.out.println(password);
	}
}
