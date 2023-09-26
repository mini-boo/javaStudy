package step01;

public class Ex04_loop {

	public static void main(String[] args) {
		//반복문
		//for 문
		
		// ? 5 10 15 ... 100 출력하려면?
//		for(int i = 1; i<=20; i++) {
//			System.out.println(i * 5);
//		}

		// ? 100 95 90 
		for(int i=20; i>=1; i--) {
			System.out.println(i*5);
		}
		
		//while 1~5 출력
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		
		
	}

}
