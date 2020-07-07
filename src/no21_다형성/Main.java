package no21_다형성;

import java.util.Scanner;

//다형성은 기본적으로 다양한 형태의 성질을 가진다는 의미를 가지고 있다.
//기본적으로 자바는 다형성을 그 특징으로 가지는 객체 지향 프로그래밍 언어이며,
//자바에서는 이 다형성을 이용하여 객체를 사용할 때 사용하는 변수 형태를 바꾸어 여러타입의 객체를 참조할 수 있다.
//결과적으로 이러한 다형성의 개념을 적절하게 이용할 때 프로그램의 소스코드를 유연하게 구성할 수 있다.
//다형성은 부모 클래스 타입의 참조변수로 하위 클래스의 객체를 참조할 수 있게 해준다.

public class Main {

	
	public static void main(String[] args) {
		//부모클래스에 변수로써 자신의 자식 클래스를 넣어줄 수 있다->다형성
		Scanner sc = new Scanner(System.in);
		System.out.print("바나나 : 1, 복숭아 :2 ?");
		int input = sc.nextInt();
		if(input == 1) {
			Fruit fruit = new Banana();
			fruit.show();			
		}else if(input == 2) {
			Fruit fruit = new Peach();
			fruit.show();
		}
		//사용자가 입력하는 것에 따라 인스턴스 변수를 쉽게 바꿀 수 있다.
		//부모클래스에서 틀을 잡아두고,그것을 사용하는 다양한 자식클래스들을 자신의 변수로 불러옴으로써 유동적으로 자신의 변수 내용을 바꿔줄 수 있다.
		
	}
}
