package springmytest.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	private B b;

	// 构造器注入，参数列表来声明来源
	@Autowired
	public A(B b) {
		this.b = b;
	}

	public void a() {
		System.out.println("this is ioc a");
		b.b();
	}
}
