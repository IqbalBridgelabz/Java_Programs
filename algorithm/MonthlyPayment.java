package com.bridgelabz.algorithm;


public class MonthlyPayment { 
	public static void monthlyPayment(double principal, double years, double rate) { 
		double r = (rate / 100) / 12;   
		double n = 12 * years;          

		double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
		double interest = payment * n - principal;

		System.out.println("Monthly payments = " + payment);
		System.out.println("Total interest   = " + interest);
	}
	public static void main(String[] args) { 
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		monthlyPayment(a,b,c); 
	} 

} 