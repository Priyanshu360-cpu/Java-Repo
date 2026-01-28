package com.ibm.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable{
	int count;
	Test(int counter){
	  count=counter;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()+"---->"+this.count);
	}
	
}
public class Application
{
	public static void main( String[] args )
	{
		ExecutorService service=Executors.newFixedThreadPool(10);
		for(int counter =1;counter<=10;counter++) {
			service.submit(new Test(counter));
		}
		service.shutdown();
	}
}