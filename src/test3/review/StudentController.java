package test3.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

	@Autowired
	private IStudentService studentService;

	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
	}

	public void findAll() {
		List<Student> list = studentService.findAll();
		System.out.println("序号\t姓名\t性别\t年龄\t专业");
		for (Student student : list) {
			System.out.println(String.format("%s\t%s\t%s\t%s\t%s", student.getNumber(), student.getName(),
					student.getGender(), student.getAge(), student.getMajor()));
		}
	}

}
