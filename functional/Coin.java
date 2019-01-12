package com.bridgelabz.functional;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {		
		int loopCount = 1;
		int numFlips=5;
		double result;
		int heads=0;
		int tails=0;
		while(loopCount < numFlips){
		result=Math.random();
		System.out.println(result);
		if(result<=.5)
		{
			//System.out.println("tails "+result);
			tails=tails+1;
			
		}
		else {
			//System.out.println("head "+result);
			heads=heads+1;
		}
		
		    loopCount++;
		}
		double percentHeads = (heads*100)/numFlips;
		double percentTails =(tails*100)/numFlips;
		System.out.println(percentHeads); 
		System.out.println(percentTails);                                
    }
}
