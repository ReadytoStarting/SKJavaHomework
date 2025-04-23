package lab.student.control;

//import java.awt.GradientPaint;

import lab.student.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(2005,"김민수","컴퓨터공학",3);
		System.out.println(student);
		
		System.out.println(student.getName() + "/" + student.getMajor() + "/" + student.getGrade() + "학년");
		System.out.println("5학년으로 변경");
		student.setGrade(5);
	
	}

}
