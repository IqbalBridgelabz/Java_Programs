package com.bridgelabz.algorithm;

//import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortForIneger {
    	
  
	public static void main(String args[]) {
		Utility utility = new Utility();
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] arr = new int[length];
	      System.out.println("Enter the elements of the array:");
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=s.nextInt();
	      }
			
			utility.bubbleasort(arr);
	      }
}
