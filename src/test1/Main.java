package test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext conttext = new ClassPathXmlApplicationContext("test1/beans.xml");
		UserController userController = conttext.getBean(UserController.class);
		userController.register("admin", "admin");
		userController.register("abc", "root");
	}
}
