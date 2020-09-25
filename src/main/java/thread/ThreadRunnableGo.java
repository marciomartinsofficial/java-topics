package thread;

public class ThreadRunnableGo {

	public static void main(String args[]) {
		MyThreadRunnable thread1 = new MyThreadRunnable("First",1000);
		MyThreadRunnable thread2 = new MyThreadRunnable("Second",100);
		MyThreadRunnable thread3 = new MyThreadRunnable("Third",500);
	}
	
}
