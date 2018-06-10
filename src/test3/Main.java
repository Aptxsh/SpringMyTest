package test3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Annotation.class);
		StudentController studentController = context.getBean(StudentController.class);
		studentController.findAll();
	}
}
