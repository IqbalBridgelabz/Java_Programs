package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double root1;
		double root2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a = sc.nextInt();
		System.out.println("Enter B value: ");
		int b = sc.nextInt();
		System.out.println("Enter C value: ");
		int c = sc.nextInt();
		double result = b*b-4*a*c;
		System.out.println(result);
		if(result>0) {
			root1 =   (-b + sqrt(result))/(2*a);
			root2 =  (-b - sqrt(result))/(2*a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
		}
		/*else if(result == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
        }
        
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = sqrt(-result) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }*/
	
	}
	private static double sqrt(double result) {
		double rsqrt =result*result;
		return rsqrt;
	}
	
}
