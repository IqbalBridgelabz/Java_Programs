package com.bridgelabz.algorithm;


import java.util.Scanner;



public class DayOfWeek {
	public static void date(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 +y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
	    int d0 = (d + x + 31 * m0 / 12) % 7;  
	    System.out.println("    "+d0+" 	 "+m0+"   "+y0);
		


	}
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);


		switch(a){
		case 0:System.out.print(" Sunday");
		break;
		case 1:System.out.print(" Monday");
		break;
		case 2:System.out.print(" Tuesday");
		break;
		case 3:System.out.print(" Wednessday");
		break;
		case 4:System.out.print(" Thusday");
		break;
		case 5:System.out.print(" Friday");
		break;
		case 6:System.out.print(" Saturday");
		}
		switch(b) {
		case 1:System.out.print(" Jan");
		break;
		case 2:System.out.print(" Feb");
		break;
		case 3:System.out.print(" Mar");
		break;
		case 4:System.out.print(" Apr");
		break;
		case 5:System.out.print(" May");
		break;
		case 6:System.out.print(" Jun");
		break;
		case 7:System.out.print(" Jul");
		break;
		case 8:System.out.print(" Aug");
		break;
		case 9:System.out.print(" Sep");
		break;
		case 10:System.out.print(" Oct");
		break;
		case 11:System.out.print(" Nov");
		break;
		case 12:System.out.print(" Dec");
		}
		System.out.println(" "+c);
		date(a,b,c);
	}

}
 