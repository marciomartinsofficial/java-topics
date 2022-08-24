package com.gmail.amarciosm.thread;

public class MyThread extends Thread {

	private String name;
	private Integer time;
	
	public MyThread(String name) {
		this.name = name;
		this.time = 100;
	}
	
	public MyThread(String name, Integer time) {
		this.name = name;
		this.time = time;
	}
	
	public void run() {
		
		for(int i=0; i<5 ; i++) {
			System.out.println(name + " #" + i);
			try {
				Thread.sleep(time);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
}
