package thread;

public class ThreadJoinIsAliveGo {

	public static void main(String args[]) {
		MyThreadRunnable1 mtr1 = new MyThreadRunnable1("Thread #1", 100);
		MyThreadRunnable1 mtr2 = new MyThreadRunnable1("Thread #2", 500);
		
		Thread thread1 = new Thread(mtr1);
		Thread thread2 = new Thread(mtr2);
		
		thread1.start();
		while(thread1.isAlive()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("The first thread ended");
		
		thread2.start();
		try {
			thread2.join(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The second thread ended");
	}
	
}
