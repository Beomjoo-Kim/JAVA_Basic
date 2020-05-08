package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class No7_기본입출력 {

	public static void main(String[] args) {
		// Scnner 객체 생성 시 사용되는 System.in 의 뜻 = 일반적으로 사용하는 콘솔창에서 입력하는 데이터를 의미

		// 파일 입출력
		File file = new File("input.txt");
		// input이라는 파일을 읽어와서 file 변수가 그것을 처리할 수 있도록 해준다는 의미
		
		try {
			Scanner sc = new Scanner(file);
			// file을 통해 입력받기 때문에 위의 File의 객체 file을 넣는다.
			while(sc.hasNextInt()) {
				//읽어온 값에 int 가있을경우
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
			// scanner 사용 후엔 항상 닫아줘야 함.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
		
		// try부분을 실행하다가 FileNotFoundException이라는 오류가 발생하면 catch문을 실행한다.
		
		
		
	}

}
