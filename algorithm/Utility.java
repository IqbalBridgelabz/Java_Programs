package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Utility {
	
	//Binary Search for string--------------------------------------------------------------------------
	public void binarySearch(String s, int first, int last, String s1)
		{  
			   //Arrays.sort(s);
			   int mid = (first + last)/2;  
			   while( first <= last ){  
			        
			      if ( s.contains(s1)  ){  
			        System.out.println("word is found at index: " + s.indexOf(s1));  
			        break;  
			      }
			      else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
		}
	
	
	
	
	
	 //Binary search for Integer
    public static int binarySearchInteger(int arr[],int first,int last,int element) {
 	  
 		      int mid = (first + last)/2;
 		      while( first <= last ){
 		         if ( arr[mid] < element ){
 		            first = mid + 1;    
 		         }else if ( arr[mid] == element ){  
 		            return mid;
 		         }else{
 		            last = mid - 1;
 		         }
 		         mid = (first + last)/2;
 		      }
 		      return -1;                    
 		   }
	

	//Bubble sort for integer------------------------------------------------

       public void bubbleasort(int[] arr) {
	   int temp;
       for(int i=0;i<arr.length;i++) {
	      for(int j=0;j<arr.length-1-i;j++) {
		  if(arr[j]>arr[j+1]) {
			  temp=arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
		  }
	    }
     }
     System.out.println("Array after sorting: ");
      for(int i=0;i<arr.length;i++) {
	  	  System.out.println(arr[i]);
      }	
    }
       
       
       
       
     // Bubble sort for String  
       public static void bubbleSort(String[] arr, int len) {
			
			for (int j = 0; j < arr.length; j++) {
			      for (int i = j + 1; i < arr.length; i++) {
			        if (arr[i].compareTo(arr[j]) < 0) {
			          String t = arr[j];
			          arr[j] = arr[i];
			          arr[i] = t;
			        }
			      }
			      System.out.println(arr[j]);
			    }
			  }
       
    //Insertion Sort for string   
       public static String[] sort_sub(String array[], int f){
			String temp="";
			for(int i=0;i<f;i++){
			for(int j=i+1;j<f;j++){
			if(array[i].compareToIgnoreCase(array[j])>0){
			temp = array[i];
			array[i]=array[j];
			array[j]=temp;
			}
			}
			}
			return array;
			}
       
      
   		
       // Insertion sort for integer
       
       public static void insertionSort(int array[]) {  
           int n = array.length;  
           for (int j = 1; j < n; j++) {  
               int key = array[j];  
               int i = j-1;  
               while ( (i > -1) && ( array [i] > key ) ) {  
                   array [i+1] = array [i];  
                   i--;  
               }  
               array[i+1] = key;  
           }  
          
       }


	


	
       
   	}
       
       
       
       


	
	