package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PrimeAndAnagram {
	
	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int num2=num;
		while(num>0) {
			int r = num%10;
			    rev = rev*10+r;
			    num = num/10;
		}
		if(rev==num2)
			System.out.println(num2+" is Palindrome");
		else
			System.out.println(num2+" is not Palindrome");
		
		
	}
	
}
	

