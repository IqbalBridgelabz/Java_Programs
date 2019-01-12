package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSortForInteger {
	
       
    public static void main(String a[]){  
    	Utility utility=new Utility();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter array size");
    	int n = sc.nextInt();
        System.out.println("Enter array element:");
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
        	arr1[i] = sc.nextInt();
        }
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        ((Utility) utility).insertionSort(arr1);    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
   }
}
