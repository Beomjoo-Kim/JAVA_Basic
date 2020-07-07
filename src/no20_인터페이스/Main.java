package no20_인터페이스;

// 인터페이스는 얼핏 보기에는 추상클래스와 매우 흡사한 개념으로 느껴질 수 있다. (추상의 경우 어떠한 메소드가 쓰인다고 암시해주는 역할)
// 인터페이스는 숙련된 자바 개발자들에게 아주 선호되는 설계 기능이면서 자바에서 다중 상속을 구현하게 해주는 고급 기술이기도 하다. (다중 상속은 기본적으로 안되지만, 인터페이스를 사용함으로써 가능하다.)
// 추상 클래스는 추상 메소드 외에 멤버변소느 일반 메소드를 가질 수 있지만, 
// 인터페이스에서는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다는 특성이 있다. (인터페이스의 경우 설계에 필요한 메소드만을 사용할 수 있다. 추상클래스보다 추상화의 정도가 높다.)
// 인터페이스는 팀 프로젝트의 동시 작업에 유리하고 일반적으로 추상보다 요구되는 설계의 기준이 높아서 더 체계적이라는 평을 받는다.

public class Main implements Dog, Cat {
	// 인터페이스의 경우 extends가 아닌, implements 사용.
	// 추상메소드의 경우 다중상속이 불가능 함
	// 인터페이스의 경우 추상클래스보다 추상화정도가 높아 설계 시 좀 더 빡빡하게 해야 하지만,
	// 다중 상속을 허용해 주고 체계적인 설계가 가능하다는 점에서 더 많이 쓰인다

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		System.out.println("월! 월!");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void two() {
		System.out.println("two");
	}

	@Override
	public void one() {
		System.out.println("one");
	}

}

// 추상클래스의 경우 함수를 선언하면 반드시 body를 작성해야 한다.