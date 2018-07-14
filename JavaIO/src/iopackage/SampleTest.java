package iopackage;

import java.util.concurrent.atomic.AtomicInteger;

public class SampleTest implements Runnable {
	private static int count=0;
	 
	public void run () {
	 
	int x = count + 1;
	 
	System.out.print (x+"");
	 
	}
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new SampleTest());
		 
		Thread thread2 = new Thread(new SampleTest());
		 
		Thread thread3 = new Thread(new SampleTest());
		 
		 
		Thread [] ta = {thread1, thread2, thread3};
		 
		for (int x= 0; x < 3; x++) {
		 
		ta[x].start();
		 
		}
	}
}
