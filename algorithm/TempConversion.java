package com.bridgelabz.algorithm;

import java.util.Scanner;

public class TempConversion {

	public static void tempConversion(double F,double C) {
		//Celsius to Fahrenheit: 
		 F = (C*9/5) + 32;
		
		//Fahrenheit to Celsius: 
		 C = (F-32) * 5/9;
		 System.out.println(F);
		 System.out.println(C);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Farenheit Value: ");
		double f = sc.nextDouble();
		System.out.println("Enter Celcious Value: ");
		double c = sc.nextDouble();
		tempConversion(f,c);
	}

}
