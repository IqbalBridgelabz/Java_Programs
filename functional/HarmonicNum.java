package com.bridgelabz.functional;

import java.util.Scanner;

public class HarmonicNum {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		float sum = 0;
		for(int i = 1 ; i<= n;i++)
		{
			sum = sum + (float)1/i;
		}
		System.out.println("Harmoni no : "+sum);
	}
}
