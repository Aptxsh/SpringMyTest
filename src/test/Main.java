package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext conttext = new ClassPathXmlApplicationContext("test/beans.xml");
		UserController userController = conttext.getBean(UserController.class);
		userController.register("admin", "admin");
		userController.register("abc", "root");
	}
}
