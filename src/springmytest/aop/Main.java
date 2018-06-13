package springmytest.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springmytest.aop.service.AService;
import springmytest.aop.service.BService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		AService aService = context.getBean(AService.class);
		int sum = aService.plus(1, 2);
		System.out.println("sum = " + sum);

		BService bService = context.getBean(BService.class);
		try {
			bService.bug();
		} catch (RuntimeException e) {
			System.out.println("应该有异常：" + e.getMessage());
		}
	}
}
