package com.question8;

public class RunThread6 implements Runnable {
	public static void main(String[] args) {
		RunThread6 r=new RunThread6();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Main Method outside run");
	}

	@Override
	public void run() {
		System.out.println("Hello Run Method");
		
	}
}
