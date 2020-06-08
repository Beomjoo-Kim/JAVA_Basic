package no18_추상;
//자바에서의 객체지향을 본격적으로 활용하기 위해서는 자바의 객체지향 개념을 더욱 더 깊게 이해하고 적용할 필요가 있다.
//자바에서는 C언어나 여타 원시겆ㄱ인 프로그래밍 언어에서는 제공하지 않았던 특수한 기능들을 제공한다.
//대표적으로 추상(Abstract)의 개념이 있으며, 그와 비슷하지만 조금 다른 개념인 인터페이스(Interface)의 개념이 존재한다.
//자바에서는 이러한 다양한 설계 기법들을 제공하기 때문에 개발 자체에서의 안정성 및 확장 가능성을 보장 받을 수 있게 된다.

//객체는 일반적으로 말하는 물건을 의미한다.
//여기서 물건은 단순한 데이터가 아니고 그 데이터의 조작 방법에 대한 정보 또한 포함하고 있어 그것을 대상으로 다루는 수법을 객체지향이라고 한다.

//자바에서는 일종의 미완성의 클래스라고 할 수 있는 추상(Abstract) 클래스를 제공한다.
//추상클래스는 직접적으로 객체 인스턴스를 생성할 수 없다.
//하지만 새로운 클래스를 작성하는데 밑바탕이 되는 역할을 해준다는 것에서 의미가 있다.
//어느정도 미리 설계로서 틀을 갖추고 클래스를 작설할 수 있게 한다는 기능적인 측면에서 의미가 있다.
public class Main extends Player {

	public static void main(String[] args) {
		//static 메소드 안에서 다른 메소드를 불러오려면 불러오려는 메소드들 또한  static으로 선언되어야한다.
		//main 인스턴스를 만들면 해결
		Main main = new Main();
		main.play("Benjamin Clementine - I Won't Complain");
//		play("Benjamin Clementine - I Won't Complain");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		
		System.out.println(songName + " 곡을 재생합니다.");
		
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
	}

	@Override
	void stop() {
System.out.println("곡을 정지합니다.");		
	}

	
	

}
//추상 클래스는 어떠한 함수를 만들어야 하는지 미리 설계해줌으로써 프로그램을 더 깔끔히 작성할 수 있다.
