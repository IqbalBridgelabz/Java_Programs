 package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSortForstring {

			public static void main(String[] args){
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter No.of string to search:");
				int n = sc.nextInt();
				String[] arr= new String[n];
				System.out.println("Enter string to sort: ");
				for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextLine();
				}
			   
			    Utility utility=new Utility();
			    @SuppressWarnings("static-access")
				String sortedArray[] = utility.sort_sub(arr, arr.length); 
			         for(int i=0;i<sortedArray.length;i++){
			            System.out.println(sortedArray[i]);
			         }
			 }

			
			
}


