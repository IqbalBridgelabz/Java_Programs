package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.algorithm.UtilityClass;

public class QuestionNumber {
	
		static int range,count,lower,upper,middle;
		static String input;
		
		public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
	   	
		{	Scanner sc = new Scanner(System.in);
			Utility u=new Utility();
	       	System.out.println("Is your number:"+middle);
			System.out.println();
			System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
			//input=u.toString();
	       	String s = sc.nextLine();
			do
	        {
	            if (input.equals("high"))
	            {
					lower= middle;
					count++;
	            }
				else if (input.equals("yes"))
	            {
					System.out.println("The number you thought was: "+middle);
					int no=count+1;
					System.out.println("It takes "+no+" times to find your exact number");
					break;
	            }
				else if(input.equals("low"))
	            {
					upper=middle;
					count++;
				}
	            if(count<n)
	            {
					middle=(lower+ upper+1)/2;
					System.out.println("Is your number "+middle+":");
					input=u.toString();
					break;
				}
			}
			while(lower<=upper);
				if (count>n)
				{
					System.out.println("Number not found");
				}
				else
				{
					System.exit(0);
				}
			}
		public static void main(String[] args)
	    {
			    int n = Integer.parseInt(args[0]);
				
				Scanner sc = new Scanner(System.in);
				int[] arr= new int[n];
				
				System.out.println("Enter array Element:");
				for(int i=0; i<n;i++)
				arr[i]=sc.nextInt();
				range=(int)(Math.pow(2,n-1));                
				System.out.println("Take number between '0' to "+range);
				count=0;
				input=null;
				lower=0;
				upper=range;
				middle=(lower+upper/2);
				QuestionNumber.binarySearch(lower,upper,middle,count,input,n);
			
	    }
	}

		
	
	

