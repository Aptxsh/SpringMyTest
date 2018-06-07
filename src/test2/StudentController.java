package test2;

import java.util.List;

public class StudentController {

	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public void list() {
		List<Student> list = studentService.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
