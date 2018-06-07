package test2.review;

import java.util.List;

public class StudentController {

	private IStudentService studentService;

	public StudentController(IStudentService studentService) {
		this.studentService = studentService;
	}

	public void list() {
		List<Student> list = studentService.findAll();
		System.out.println("序号\t姓名\t性别\t年龄\t专业");
		for (Student student : list) {
			System.out.println(String.format("%s \t%s \t%s \t%s \t%s", student.getNumber(), student.getName(),
					student.getGender(), student.getAge(), student.getMajor()));
		}
	}
}
