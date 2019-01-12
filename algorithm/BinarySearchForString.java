package com.bridgelabz.algorithm;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.lang.reflect.Array;
import com.bridgelabz.algorithm.Utility;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class BinarySearchForString {


/*	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		Scanner sc = new Scanner(new FileReader("test.txt"));
		String s=" ",str1=""; 
		while(sc.hasNext())
		{	
			int n;
			try {
				s = sc.nextLine();
				System.out.println(s);
				n=s.length();
			}
			
			catch(NoSuchElementException exception) {
				System.out.println("Enter search String :");
			    str1=sc.nextLine();
			}
			
			utility.binarySearch(s,0,s.length(),str1);
		}
	}
}*/

public static void main(String[] args) {
		Utility utility = new Utility();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String str=sc.nextLine();
		System.out.println("Enter search String :");
		String str1=sc.nextLine();
		int n=str.length();
		utility.binarySearch(str,0,str.length(),str1);
	}
}
