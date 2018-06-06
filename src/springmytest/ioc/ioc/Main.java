package springmytest.ioc.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmytest/ioc/ioc/beans.xml");
		A a = context.getBean(A.class);
		a.a();
	}
}
