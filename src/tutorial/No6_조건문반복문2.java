package tutorial;

public class No6_조건문반복문2 {
	
	// 하나의 비교 연산자는 true 혹은 false를 반환한다.
	// 모든 조건문, 반복문에서는 웬만해서는 무조건 괄호를 적용하라.
	// for문 혹은 while 문은 얼마든지 중첩될 수 있다.
	// for(;;)는 whole(true)와 똑같이 무한루프로 동작한다.
	// break; 를 이용하여 반복문을 즉시 빠져나올 수 있다.
	
	final static int N = 15;

	public static void main(String[] args) {
		// 원을 출력하는 프로그램 작성
		// x^2+y^2 = r^2
//		for(int i=-N; i<=N;i++) {
//			
//			for(int j=-N; j<=N; j++) {
//				
//				if(i*i+j*j<=N*N) {
//					
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			
//		}

		drawCircle(N);
		
	}

	
	
	
	static void drawCircle (int r) {
		for(int x=-r; x<=r; x++) {
			
			for(int y=-r; y<=r; y++) {
				
				if(x*x+y*y<=r*r) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
				
	}
	
}
