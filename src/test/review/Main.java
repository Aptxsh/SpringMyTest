package test.review;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test/review/beans.xml");
		A a = context.getBean(A.class);
		a.a();
	}
}
