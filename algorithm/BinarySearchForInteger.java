package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearchForInteger {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int i;
		Utility utility=new Utility();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array size:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter array Element:");
		for( i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int index=utility.binarySearchInteger(arr,0,arr.length,20);
		
		if (index != -1) {
	         System.out.println( "Element present at index: " + index);
	      } else {
	         System.out.println( "Element is not present.");
	      }
	}

}
