package com.sac;

public class ThreadSynchronizationDemoMain {

	public static void main(String[] args) {
		
		PrintDemo printDemo = new PrintDemo();
		
		ThreadSynchronizationDemo t1 =new ThreadSynchronizationDemo(printDemo, "Thread 1");
		ThreadSynchronizationDemo t2 = new ThreadSynchronizationDemo(printDemo, "Thread 2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
