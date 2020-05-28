package tutorial;

public class No14_다차원배열 {
//	다차원 배열은 배열이 배열의 원소로 들어가는 구조를 말한다.
//	흔히 이차원 배열은 M X N 형태의 지도를 나타내고자 할 때많이 사용된다.
//	이러한 다차원 배열을 적절하게 활용하게 되면 현실 세계의 다양한 문제에 보다 쉽게 접근할 수 있다.

	//10 X 10의 정수 랜덤 데이터를 생성하여 전체 데이터를 분석
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50;
		//행과 열의 데이터 길이
		int [][] arr = new int[N][N];
		//이차원 배열 생성
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = (int)(Math.random()*10);
				//0~9의 랜덤한 수 삽입
			}
		}
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
