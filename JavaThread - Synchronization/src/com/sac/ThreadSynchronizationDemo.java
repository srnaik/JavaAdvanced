package com.sac;

public class ThreadSynchronizationDemo extends Thread{

	private Thread thread;
	private String threadName;
	private PrintDemo printDemo;
	
	public ThreadSynchronizationDemo(PrintDemo printDemo, String threadName) {
		
		this.printDemo = printDemo;
		this.threadName = threadName;
		
	}
	
	@Override
	public void run() {
		
		//super.run();
		synchronized (printDemo) {
			printDemo.printCount();
		}
		System.out.println("Extiting Thread : " + threadName);
	}
	
	@Override
	public void start(){
		
		System.out.println("Starting Thread : " + threadName);
		
		if(thread == null){
			thread = new Thread(this, "Custom Thread");
			thread.start();
		}
	}
}
