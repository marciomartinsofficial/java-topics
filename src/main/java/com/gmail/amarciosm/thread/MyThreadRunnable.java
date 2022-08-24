package com.gmail.amarciosm.thread;

public class MyThreadRunnable implements Runnable {

	private String name;
	private Integer time;
	
	public MyThreadRunnable(String name, Integer time) {
		this.name = name;
		this.time = time;
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(name + " #" + i);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Final " + name);
	}

}
