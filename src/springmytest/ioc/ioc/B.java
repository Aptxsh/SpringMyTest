package springmytest.ioc.ioc;

public class B {

	private C c;

	// setter注入，声明来源不明显
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void b() {
		System.out.println("this is ioc b");
		c.c();
	}

}
