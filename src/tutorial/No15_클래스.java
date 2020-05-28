package tutorial;

public class No15_클래스 {
//	클래스는 객체 지향 프로그래밍에 있어서 가장 기본이 되는 것이다.
//	클래스를 이용하여 현실 세계의 특정한 물건을 지칭할 수 있다.
//	가장 대표적으로 많이 사용되는 것이 Node클래스이다.
//	이는 하나의 장소나 위치를 의미하리 수도 있으며 자료구조에서 말하는 이진 탐색 트리의 하나의 서브 트리가 될 수있다.
//	또한 개발 프로젝트에서는 종종 Student 클래스와 같이 하나의 처리할 데이터 단위를 명시하는데 사용된다.

//Node 클래스 사용
	
	
	// 클래스를 만든 후 실제로 코드 내에서 사용하기 위해서 만든것이 클래스이다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node one = new Node(10, 20);
		//one 이라는 이름의 10,20 좌표를 가진 Node 생성
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		System.out.println("x : "+result.getX()+", y : "+result.getY());
		
	}

}
