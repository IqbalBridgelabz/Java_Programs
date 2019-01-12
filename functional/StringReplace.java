package com.bridgelabz.functional;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) 
	{
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter User name:");
	    	String s1=sc.nextLine();
	    	//String s1="Iqbal";
	        String s2="Hello <<User name>> How are you";  
	        String replaceString=s2.replaceAll("<<User name>>", s1);
	        System.out.println(replaceString);  
	        } 
	}

