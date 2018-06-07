package test2;

public class Student {

	private int number;
	private String name;
	private int age;
	private String major;

	public Student() {
	}

	public Student(int number, String name, int age, String major) {

		this.number = number;
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
