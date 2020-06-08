package no16;

public class Student extends Person {

	private String studentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		//변수 안에는 name, age 등이 없는데 있는 이유
		//개발의 편의성을 위해 상속받은 클래스의 변수 또한 한번에 적용해주는 것
		//Student가 Person을 상속받았으므로 자신의 변수로 한번에 사용하게 되는 것
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	
	public void show() {
		System.out.println("---------------------------");
		System.out.println("학생 이름 : "+ getName());
		System.out.println("학생 나이 : "+ getAge());
		System.out.println("학생 키 : "+ getHeight());
		System.out.println("학생 몸무게 : "+ getWeight());
		System.out.println("학번 : "+ getStudentID());
		System.out.println("학년 : "+ getGrade());
		System.out.println("학점 : "+ getGPA());

		
	}
	
}
