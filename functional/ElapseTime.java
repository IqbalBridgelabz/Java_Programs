package com.bridgelabz.functional;

//import java.io.PrintWriter;

public class ElapseTime {

	public static void main(String[] args) throws InterruptedException {
		//PrintWriter pw = new PrintWriter(System.out);
		long start = System.currentTimeMillis();
		System.out.println("start: "+start);
		Thread.sleep(1000);
		long finish = System.currentTimeMillis();
		System.out.println("Finish: "+finish);
		@SuppressWarnings("unused")
		long timeElapsed = finish - start;
		System.out.println("Elapsed Time: "+timeElapsed);
	}

}
