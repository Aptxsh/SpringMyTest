package springmytest.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmytest/ioc/beans.xml");
		A a = context.getBean(A.class);
		a.a();
	}
}
