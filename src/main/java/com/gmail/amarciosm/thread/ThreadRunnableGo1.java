package com.gmail.amarciosm.thread;

public class ThreadRunnableGo1 {

	public static void main(String args[]) {
		Thread thread1 = new Thread(new MyThreadRunnable1("First",1000));
		Thread thread2 = new Thread(new MyThreadRunnable1("Second",100));
		Thread thread3 = new Thread(new MyThreadRunnable1("Third",500));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
	
}
