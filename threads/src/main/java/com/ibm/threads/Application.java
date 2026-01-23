package com.ibm.threads;
class Runner implements Runnable{
	@Override
	public void run() {
		System.out.println("Current running thred is "+Thread.currentThread());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		
	}
	}
}
public class Application
{
	public static void main( String[] args )
	{
		System.out.println(Thread.currentThread());
		Runner runner=new Runner();
		Thread thread1=new Thread(runner,"consumer");
		Thread thread2=new Thread(runner,"producer");
		System.out.println(thread1);
		System.out.println(thread1.getState());
		thread1.start();
		thread2.start();
		System.out.println(thread1.getState());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {//may remove this
		    thread1.join();
		    thread2.join();
			
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println(thread1.getState());
		System.out.println(thread2.getState());
		System.out.println("The End");
	}
}