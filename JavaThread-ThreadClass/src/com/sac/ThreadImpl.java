package com.sac;

public class ThreadImpl extends Thread{
	
	private String threadName;
	
	public ThreadImpl(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		for(int i = 4;i>0;i--){
			System.out.println("Thread Name: " + threadName + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args){
		
		ThreadImpl threadImpl = new ThreadImpl("Custom Thread");
		Thread thread = new Thread(threadImpl, threadImpl.getThreadName());
		thread.start();
		
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
