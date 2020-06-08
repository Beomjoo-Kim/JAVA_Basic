package no16;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20, 182, 76, "201112112", 1, 4.5);
		Student student2 = new Student("이순신", 30, 170, 80, "200312112", 4, 3.0);
		
		student1.show();
		student2.show();
	}

}
