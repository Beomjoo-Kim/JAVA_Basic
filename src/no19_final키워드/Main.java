package no19_final키워드;
// 자바에서 절대 변하지 않는 특정한 것을 정하고 싶을 때는 최종(final)을 사용한다.
// 이 키워드는 변수, 메소드, 클래스에 모두 사용 할 수 있다.
// 변수에 사용할 경우 변하지 않는 상수가 되며, 메소드가 사용할 때는 재정의가 불가능한 메소드가 되며,
// 클래스에 사용할 때는 상속이 불가능한 하나의 완전한 클래스가 되는 것 이다.

public class Main extends Parent{
	//parent라는 클래스를 final void parent로 바꾸면 더 이상 어느 클래스에서도 상속을 받을 수 없는 클래스가 된다.
	
	
//	public void show() {
//		System.out.println("Hello");
//	}
	// parent에서 정의햇던 show라는 함수는 main에서 상속받으며 똑같은 이름으로 오버라이딩 되었기때문에 자식클래스에서 정의 되었던  Hello를 출력하는 함수가 됨.
	// parent에서 show 함수를 정의할 때 final을 붙이면 main을 비롯한 다른 클래스에서 오버라이딩 하는 것이 불가능해 진다. 
	public static void main(String[] args) {

		
		Main main = new Main();
		final int number = 10;
		// final 이 붙음 = 상수
		
		// number = 5;  오류발생 = final을 사용하였기에.
		System.out.println(number);
		
		main.show();
	}

}
