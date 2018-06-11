package test5;

public class Student {

	private Integer id;
	private String name;
	private Gender gender;
	private Integer age;
	private String major;

	public Student(Integer id, String name, Gender gender, Integer age, String major) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}

	public Student(String name, Gender gender, Integer age, String major) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	public String getMajor() {
		return major;
	}
}
