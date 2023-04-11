package advance.dev;

public class Teacher extends Person {
	protected double hsLuong;
	protected String teachID;
	private final double luong = 1500000;
	
	public Teacher(String name, String phone, int age, double hsLuong, String teachID) {
		super(name, phone, age);
		this.hsLuong = hsLuong;
		this.teachID = teachID;
	}
	
	public double tinhLuong() {
		return luong * hsLuong;
	}
}
