package tutorial;

public class No11_반복함수와재귀함수_1 {
//	반복함수는 단순히 while 또는 for문법을 이용하여 특정한 처리를 반복하는 방식으로 문제를 해결하는 함수이다.
//	반면에 재귀 함수는 자신의 함수 내부에서 자기 자신을 스스로 호출함으로써 재귀적으로 문제를 해결하는 함수이다.
//	재귀 함수는 경우에 따라서는 아주 간결하고 직관적인 코드로 문제를 해결할 수 있게 해주지만 떄에 따라서는 심각한 비효율성을 낳을 수 있기 때문에 알고리즘을 작성할 떄 유의해야한다.

	//팩토리얼을 반복 함수로 구현
	public static int factorial(int number) {		
		int sum = 1;
		for(int i = 2; i <= number; i++) {
			sum *= i;
		}		
		return sum;		
	}
	
	//팩토리얼을 재귀 함수로 구현	
	public static int factorial2(int number){
		if(number == 1) {
			return 1;
		}else
			return number * factorial(number-1);
		//number가 1이 되어서 1로 리턴할 때까지 1씩 줄여나가며 결과에 곱함
		// example) 5! = 5 * 4!
	}
	
	public static void main(String[] args) {

		System.out.println("1. 10 팩토리얼은 : " + factorial(10));
		System.out.println("2. 10 팩토리얼은 : " + factorial2(10));
		
		
	}

}
