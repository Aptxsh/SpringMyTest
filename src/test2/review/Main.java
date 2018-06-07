package test2.review;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test2/review/beans.xml");
		StudentController controller = context.getBean(StudentController.class);
		controller.list();
	}
}
