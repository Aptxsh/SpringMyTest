package test3;

public class Student {

	private int number;
	private String name;
	private Gender gender;
	private int age;
	private String major;

	public Student(int number, String name, Gender gender, int age, String major) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getMajor() {
		return major;
	}
}
