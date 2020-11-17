package com.threads;

public class WithThread implements Runnable{

	public static void main(String[] args) {
		WithThread wt=new WithThread();
		Thread t=new Thread(wt);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("x value is:"+i);
		}
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is:"+i);
		}
	}

}