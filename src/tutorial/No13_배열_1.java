package tutorial;

import java.util.Scanner;

public class No13_배열_1 {
//	배열은 쉽게 말해 데이터가 많을 때 사용하는 것이다.
//	가장 간단한 프로그램예제 에서는 단순히 한 두개의 변수만으로 프로그램을 작동시킬 수 있었지만,
//	현실에서의 다양한 프로그램에서는 아주 많은 양의 데이터가 사용되는것이 일반적이다.
//	따라서 데이터가 많을 때 주로 배열을 이용한다.
//	이 때 배열은 한없이 많을 수 있으면서도 그 데이터 갯수가 변경될 수 있는 데이터들의 집합을 지정해줄 수 있기에 효과적으로 대부분의 프로그램에 사용된다.

	 public static int max(int a, int b) {		 
		 return (a>b) ? a : b;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하시오 : ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		for(int i = 0; i < number; i++) {
			System.out.print("배열에 입력할 정수를 하나씩 입력하시오 : ");
			arr[i] = sc.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++) {
			result = max(result, arr[i]);
		}
		System.out.println("입력한 정수 중 가장 큰 값은 : " + result);
	}

}
