package com.upskill.java_6;

public class MultiThreading {

	public static void main(String[] args) {
		
		int n = 2;
		for (int i = 0; i < n; i++) {
			MultithreadindDemo obj = new MultithreadingDemo();
			Thread obj2 = new Thrread(new MultithreadingDemo2());
			obj.start();
			obj2.start();

	}

}
}
class MultithreadingDemo extends Thread{
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}