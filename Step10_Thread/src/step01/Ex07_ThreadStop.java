package step01;

class InterruptedThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("무한 실행.");
		
		if(Thread.interrupted()) {
			System.out.println("종료함");
			//break;
		}
	}
}

public class Ex07_ThreadStop {

	 public static void main(String[] args) {
		 InterruptedThread iThread = new InterruptedThread();
		 
		 iThread.start();
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
