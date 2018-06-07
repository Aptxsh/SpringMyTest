package test.review;

public class A {

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void a() {
		System.out.println("a");
		b.b();
	}
}
