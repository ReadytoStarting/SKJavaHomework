package lab.student.entity;

public class Student {
	private int studentId;
	private String name;
	private String major;
	private int grade;
	
	public Student() {}
	
	public Student(int studentId, String name, String major, int grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if (grade > 4 | grade < 1) {
			System.out.println("학년은 1~4 사이여야 합니다");
		}
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", major=" + major + ", grade=" + grade + "]";
	}
	
	
	
}
