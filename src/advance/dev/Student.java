package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phone_number;
	private double average_score;

	public void student(String name, int age, String address, String phone_number, double average_score) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone_number = phone_number;
		this.average_score = average_score;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public double getAverage_score() {
		return average_score;
	}

	public void setAverage_score(double average_score) {
		this.average_score = average_score;
	}

}
