package com.threads;

public class ThreadEx extends Thread{

	public static void main(String[] args) {
		ThreadEx te=new ThreadEx();
		te.start();
		for(int i=0;i<=10;i++) {
			System.out.println("x value is:"+i);
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is:"+i);
		}
	}

}