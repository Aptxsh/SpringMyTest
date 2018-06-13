package springmytest.aop.review;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.register("zhangsan", "123abc");
		try {
			userService.login("zhangsan", "123456");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
