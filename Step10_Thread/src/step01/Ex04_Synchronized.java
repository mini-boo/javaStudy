package step01;

// num이 7이 아닐때에만 setNum 동작하는 기능
class NumberChange {
	int num;
	
	public synchronized void setNum(int num) {
		if(this.num != 7) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.num = num;
			System.out.println(num);
		}else {
			System.out.println("num 값을 변경할 수 없습니다.");
		}
	}
}

public class Ex04_Synchronized {
	public static void main(String[] args) {
		NumberChange nc = new NumberChange();
		
		// 스레드 1 
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNum(7);
			}
		});

		// 스레드 2 
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				nc.setNum(10);
			}
		});
		
		
		thread1.start();
		thread2.start();
		
		// 예상 결과 
		//1. 스레드 1 먼저 실행 : -> 스레드 2 실행 x
		//2. 스레드 2 먼저 실행 : -> 스레드 1 실행 o
	
	}
}