package tutorial;

public class No12_반복함수와재귀함수_2 {
	
	//피보나치 수열 반복함수로  구현
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1) {
			return 1;
		}else if (number == 2) {
			return 1;
		}else {
			for(int i = 2; i<number; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	//피보나치 수열 재귀함수로 구현
	public static int fibonacci2(int number) {
		if(number == 1) {
			return 1;
		}else if(number == 2) {
			return 1;
		}else {
			return fibonacci2(number-1) + fibonacci2(number-2);
		}		
	}
	// 이 경우 50번째 피보나치를 구하기 위해선 2의 50승정도의 계산이 필요함.
	// 연산량이 매우 커져 매우 비효율적임. 이 재귀함수의 경우 50번째 피보나치 수열을 구하는데 매우 오래걸림.
	// 이를 해결하기 위해 동적 프로그래밍이 필요하다.
	
	public static void main(String[] args) {
	System.out.println("1. 피보나치 수열의 10번째 수는 " + fibonacci(10));
	System.out.println("2. 피보나치 수열의 10번째 수는 " + fibonacci2(10));
	}

}
