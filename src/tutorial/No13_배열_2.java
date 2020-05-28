package tutorial;

public class No13_배열_2 {
	//100개의 랜덤 정수의 평균을 구하는 프로그램 작성
	
	
	public static int avg(int[] array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum/array.length;
	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i<100; i++) {
			arr[i] = (int) (Math.random()*100+1);
			//math.random은 랜덤한 하나의 수를 가져오는 것.
			//0 ~ 0.xxx의 값을 생성. ( 0보다 크고 1보다 작음)
			//*100 -> 0~100
			//+1 -> 1~101
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 : " + avg(arr));
	}

}
