package com.bridgelabz.functional;

public class powerOf2 {

	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		for(int i=1;i<31;i++) {
			int pow; 
			pow=(int) Math.pow(n,i);
			System.out.println(pow);
		}
	}

}
