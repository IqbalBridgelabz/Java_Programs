package com.bridgelabz.functional;

import java.util.Random;

/*Given N distinct Coupon Numbers, 
how many random numbers do you need to generate distinct coupon number? 
This program simulates this random process.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
*/
public class CouponNumber {
	public static void main(String[] args) {
		/*Random num=new Random();
		int num2;
		for(int i=1;i<15;i++) {
			num2 = 1+num.nextInt(6);
			System.out.println(num2);*/
			  int result =0;
			  result = couponCollector(Integer.parseInt(args[0]));
			  System.out.println(result);
			 }

			 public static int couponCollector(int number) {
			  boolean[] collected = new boolean[number];
			  int iteration = 0;
			  int unique = 0;

			  while(unique < number){
			   int random = (int) (Math.random() * number);
			   if(!collected[random]){
			    unique++;
			    collected[random] = true;
			   }
			  iteration++;
			  }
			  return iteration;
		}
} 


