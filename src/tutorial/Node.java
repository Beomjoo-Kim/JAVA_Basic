package tutorial;

public class Node {
	//Node란 위치의 좌표를 의미한다.
	
	private int x;
	private int y;
	//private 는 외부에서 접근할 수 없는 형태.
	
	public int getX() {
		//private 한 x,y에 접근하게 하기 위한 메소드
		return x;		
	}
	public void setX(int x) {
		//매개 변수로 넘어온 x 값을 this.x에 넣어 private x를 바꿔준다.
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	// 자바에서 제공하는 객체지향 프로그래밍의기본적인 보안
	
	//생성자
	//객체를 하나 만들어 줄 때 자동으로 값들을 초기화해주는 함수
	//class와 동일한 이름을 가지고 있는 것이 특징
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		//반환형 Node -> 다른 Node를 매개로 하여 비교해 정 중앙의 좌표를 반환할 수 있도록 하는것
		return new Node((this.x + other.getX()) /2, (this.y + other.getY())/2);
		
		
	}
	

}
