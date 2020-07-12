package no22_Object클래스;
//객체(Object)클래스는 모든 객체의 조상으로서 쓰인다. 자바에서 모든 클래스는 암시적으로 Object클래스를 상속 받고있다.
//그러한 이유에서 Object클래스는 모든 클래스의 조상이라고 할 수있다. 이런 클래스가 존재하는 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제동하기 위해서이다.

public class Main {
	
	
	public static void main(String[] args) {
		
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2);//false -> 두 인스턴스는 기본적으로 다른 인스턴스임
		System.out.println(archer1.equals(archer2));//true -> 두 인스턴스의 내부 값이 같음
		
	}
}
