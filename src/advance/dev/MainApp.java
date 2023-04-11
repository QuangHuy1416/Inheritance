package advance.dev;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[1];
		input(st,sc);
		output(st);
		Teacher[] teacher = new Teacher[1];
		input(teacher,sc);
		output(teacher);
	}

	private static void output(Teacher[] teacher) {
		for(Teacher t : teacher) {
			System.out.format("Name: %s, Phone: %s, Age: %d, TeacherId: %s, Luong: %.2f.",
					t.getName(),
					t.getPhone(),
					t.getAge(),
					t.teachID,
					t.tinhLuong()
					).println() ;
		}
	}

	private static void input(Teacher[] teacher, Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Phone: ");
			String phone = sc.nextLine();
			
			System.out.println("Age: ");
			int age = checkInt(sc.nextLine(),sc);
			sc.nextLine();
			
			System.out.println("Nhap he so luong: ");
			double hsLuong = check(sc.nextLine(),sc);
			
			System.out.println("TeacherID: ");
			String teacherID = sc.nextLine();
			teacher[i] = new Teacher(name, phone, age, hsLuong, teacherID);
			}
		
	}
	
	private static void output(Student[] st) {
		for(Student student : st) {
			System.out.format("Name: %s, Phone: %s, Age: %d, Math: %.2f, Physical: %.2f, Chemistry: %.2f, Mark: %.2f, StudentId: %s, Class: %s.",
					student.getName(),
					student.getPhone(),
					student.getAge(),
					student.math,
					student.physical,
					student.chemistry,
					student.mark(),
					student.idStudent,
					student.classStudent
					).println() ;
		}
	}

	private static void input(Student[] st, Scanner sc) {
		for (int i = 0; i < st.length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Phone: ");
			String phone = sc.nextLine();
			
			System.out.println("Age: ");
			int age = checkInt(sc.nextLine(),sc);
			sc.nextLine();
			
			System.out.println("Math: ");
			double math, physical, chemistry;
			math = check(sc.nextLine(),sc);
			sc.nextLine();
			
			System.out.println("Physical: ");
			physical = check(sc.nextLine(),sc);
			sc.nextLine();
			
			System.out.println("Chemistry: ");
			chemistry = check(sc.nextLine(),sc);
			sc.nextLine();
			
			System.out.println("Student ID: ");
			String id = sc.nextLine();
			
			System.out.println("Class: ");
			String clas = sc.nextLine();
			
		    st[i] = new Student(name, phone, age, math, physical, chemistry, id, clas);
			}
	}
	
	//ham check loi nhap so nguyen vao tu ban phim 
	static int checkInt(String num, Scanner sc) {
		int number = 0;
		boolean isContinue = true;
		while(isContinue)
		{
			try {
				number = Integer.parseInt(num); 
                isContinue = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Khong phai so nguyen, xin nhap lai.");
				num = sc.nextLine();
			}
		}
		return number;
	}
	
	//ham check loi nhap so thuc vao tu ban phim 
		static double check(String num, Scanner sc) {
			double number = 0;
			boolean isContinue = true;
			while(isContinue)
			{
				try {
					number = Double.parseDouble(num); 
	                isContinue = false;
				}
				catch (NumberFormatException e) {
					System.out.println("Khong phai so, xin nhap lai.");
					num = sc.nextLine();
				}
			}
			return number;
		}
}
