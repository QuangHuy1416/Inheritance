package advance.dev;

public class Student extends Person {
	protected double math, physical, chemistry;
	protected String idStudent, classStudent;
	
	public Student(String name, String phone, int age, double math, double physical, double chemistry, String idStudent,
			String classStudent) {
		super(name, phone, age);
		this.math = math;
		this.physical = physical;
		this.chemistry = chemistry;
		this.idStudent = idStudent;
		this.classStudent = classStudent;
	}


	public double mark()
	{
		return (math + physical + chemistry) / 3;
	}
}
