package com.bridgelabz.algorithm;

import java.util.Scanner;

public class ToBinary
{
	

	public static void main(String[] args)
	{
		int value;
		String binary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num:");
		value=sc.nextInt();
		binary=Integer.toBinaryString(value);
		//System.out.println(binary);
		String temp = binary;
		System.out.println(temp);
		String[] temp2 = new String[8];
		String[]temp3=new String[temp2.length];
		for(int i=4;i<temp2.length;i++) {
			temp3[]+=temp2[i];
			System.out.println(temp3[i]);
		}
		
	}
	
}


    

  
