package lab.student.control;

//import java.awt.GradientPaint;

import lab.student.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(2005,"��μ�","��ǻ�Ͱ���",3);
		System.out.println(student);
		
		System.out.println(student.getName() + "/" + student.getMajor() + "/" + student.getGrade() + "�г�");
		System.out.println("5�г����� ����");
		student.setGrade(5);
	
	}

}
