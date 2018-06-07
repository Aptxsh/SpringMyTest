package springmytest.manual;

public class Main {

	public static void main(String[] args) {
		// 手动依赖注入
		// 初始化顺序相反
		C c = new C();
		B b = new B();
		b.setC(c); // setter方法注入c
		A a = new A(b); // 构造器注入b
		a.a();
	}
}
