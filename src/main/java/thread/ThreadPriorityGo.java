package thread;

public class ThreadPriorityGo {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("First",1000);
		MyThread myThread2 = new MyThread("Second",500);
		MyThread myThread3 = new MyThread("Third");
		
		myThread1.start(); // no run(), but yes start()
		myThread2.start();
		myThread3.start();
	}

}
