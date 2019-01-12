package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSortForString { 
	
		public static void main(String[] args){
			Utility utility=new Utility();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length of string");
			int len=sc.nextInt();
			String[] arr = new String[len];
			for(int i=0; i<len;i++) {
				arr[i] = sc.nextLine();
			}
			utility.bubbleSort(arr,len);
			
		 }

		
			}
			
		



