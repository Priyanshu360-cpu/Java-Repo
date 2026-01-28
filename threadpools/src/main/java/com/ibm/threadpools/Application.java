package com.ibm.threadpools;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Test implements Runnable{
	int count;
	Test(int counter){
	  count=counter;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()+"---->"+this.count);
		System.out.println(new Date());
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
		int vCPU = Runtime.getRuntime().availableProcessors();
		ScheduledExecutorService service1=Executors.newScheduledThreadPool(vCPU);
		System.out.println("Started Sechduling taks at "+new Date());
//			service1.schedule(new Test(counter),10,TimeUnit.SECONDS);
//		service1.scheduleAtFixedRate(new Test(1), 10, 5, TimeUnit.SECONDS);

			service1.scheduleWithFixedDelay(new Test(2), 10, 5, TimeUnit.SECONDS);
		
	}
}