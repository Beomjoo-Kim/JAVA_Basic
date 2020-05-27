package tutorial;

public class No10_사용자정의함수_2 {
	// 약수 중 k번째로 작은 수 출력
	public static int func (int number, int k) {
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				// number % 0 은 오류 발샐
				k--;
				if(k == 0) return i;
			}
		}
	
		return -1;
		//약수의 갯수는 당연히 0개 이상이므로 -1이라는 값이 나오지 않음
	}

	
	//문자열에서 마지막 단어를 반환하는 함수 작성	
	public static char func2(String input) {
		return input.charAt(input.length()-1);
		//String 은 하나의 문자열를 의미하는 자료형으로써 내부적으로 class임
		//맨 앞글자는 charAt(0)이르모 -1 해주어야 한다.
	}
	
	//max()를 이용하여 최댓값을 저장하는 프로그램
	public static int max (int a, int b) {
		return ((a>b) ? a : b);
	}
	
	//max를 이용해 세 수 중 가장 큰 수 찾기
	public static int func3(int a, int b, int c) {
		int result = max(a,b);
		result = max(result, c);
		return result;
	}
	
	
	public static void main(String[] args) {
		int result = func(3050, 10);
		if(result == -1) {
			System.out.println("3050의 약수는 없습니다.");
		}else System.out.println("3050의 10번째 약수는 " + result + "입니다.");

		
		System.out.println("Hello World의 마지막 문자는 " + func2("Hello world") + "입니다.");
		
		System.out.println("(123, 456, 138)중 가장 큰 수 : " + func3(123,456,138));
	}

}
