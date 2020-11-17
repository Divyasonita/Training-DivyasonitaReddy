package com.threads;

public class AliveDemo {

	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
	}

}