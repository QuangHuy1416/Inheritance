package advance.dev;

public class Person {
	private String name, phone;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
}
