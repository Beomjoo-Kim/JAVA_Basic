package no20_인터페이스;

public interface Dog {

	abstract void crying();
	
	
//	public void show() {
//		System.out.println("Hello World");
//	}
//	에러 이유 = 인터페이스에는 미리 어떠한 일반 메소드를 가지고있는것을 막아둠. 인터페이스 안에서는 설계만 해야함.
//	Dog 클래스가 추상 클래스라면 사용가능
	
	public void show();
	//이러한 함수가 존재한다는 것만 알려주어야 함.
	
	public void one();
}
