package test5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		StudentController studentController = context.getBean(StudentController.class);
		// studentController.findOne(2);
		// studentController.add(new Student("李四", Gender.男, 22, "C++"));
		// studentController.delete(21);
		//studentController.update(2, new Student("李四", Gender.男, 22, "C++"));
		studentController.password("123");
	}

}
