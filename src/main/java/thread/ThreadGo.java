package thread;

public class ThreadGo {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("First",500);
		MyThread myThread2 = new MyThread("Second",500);
		MyThread myThread3 = new MyThread("Third",500);
		
		myThread1.setPriority(Thread.NORM_PRIORITY); // numbers from 1 to 10
		myThread2.setPriority(Thread.MAX_PRIORITY);
		myThread2.setPriority(10);
		myThread3.setPriority(Thread.MIN_PRIORITY);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
	}

}
