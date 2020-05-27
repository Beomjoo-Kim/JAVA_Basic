package tutorial;

public class No9_사용자정의함수_1 {
	
//	사용자 정의 함수는 정해진 특정한 기능을 수행하는 모듈을 의미하며 함수를 적절히 활용하면 하나의 문제를 잘게 분해할 수 있다.
//	예를들어 이진 탐색 트리는 삽입, 삭제, 순회 등 다양한 함수의 집합으로 구성된다.
//	만약 사용자 정의 함수가 없다면 오직 메인 함수에서 모든 알고리즘을 처리해야 하는데 이는 작업의 효율성을 저하시킬 수 있다.
//	또한 함수는 각각의 모듈로서 쉽게 수정되고 보완될 수 있다는 장점이 있다.
	
	
	// 3개의 정수 받아서 최대공약수 출력
	//반환형, 함수명, 매개변수
	public static int func(int a, int b, int c) {
		int min;
		if(a>b) {
			if(b>c) {
				min = c;
			}else min = b;
		}else {
			if(a>c) {
				min = c;
			}else min = a;
		}
		//a, b, c 셋중 가장 작은 값 찾기
		
		for(int i=min; i>0; i--) {
			if(a%i==0 && b%i==0 && c%i==0) return i;
			// break 하고 return i 로 하려면 int i를 for문 밖에서 선언해야함.
		}
		
		return -1;
		//-1 반환으로 최대공약수가 없다는 것을 알림
	}
	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대공약수 : " + func(400,300,750));
		
		
		
	}

}
