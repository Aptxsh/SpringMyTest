package test3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

	@Autowired
	private IStudentService sudentService;

	public StudentController(IStudentService sudentService) {
		this.sudentService = sudentService;
	}

	public void findAll() {
		List<Student> list = sudentService.findAll();
		System.out.println("序号\t姓名\t性别\t年龄\t专业\t");
		for (Student student : list) {
			System.out.println(String.format("%s\t%s\t%s\t%s\t%s", student.getNumber(), student.getName(),
					student.getGender(), student.getAge(), student.getMajor()));
		}
	}
}
