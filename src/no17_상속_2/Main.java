package no17_상속_2;

import java.util.Scanner;

//실제로 실생활에 사용할 땐 배열을 많이 사용한다.

public class Main {

	public static void main(String[] args) {
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			students[i] = new Student("홍길동", 20, 175, 70, i+"", 1, 4.5);
//			// i의 경우 정수이므로 뒤에 + ""를 붙여 문자열 상태로 바꿔준다.
//			students[i].show();
//		}
//		Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "1234", 30000000, 3);	
//		teacher1.show();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 몇 명의 학생이 존재합니까 ? ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("학생의 나이을 입력하세요 : ");
			age = sc.nextInt();
			System.out.print("학생의 키을 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("학생의 몸무게을 입력하세요 : ");
			weight = sc.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();
			students[i] = new Student( name,  age,  height,  weight,  studentID,  grade,  gPA);

			
		}
		
		for(int i = 0; i < number; i++) {
			students[i].show();
		}
	}

}
