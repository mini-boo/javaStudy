package step01;

public class Ex01_Thread extends Thread {

	public static void main(String[] args) {
		
		//실행
		Ex01_Thread thread1 = new Ex01_Thread();
		thread1.setName("스레드 1");
		thread1.start();
		System.out.println(thread1);

		Ex01_Thread thread2 = new Ex01_Thread();
		thread2.start();
		System.out.println(thread2);
	}

}
