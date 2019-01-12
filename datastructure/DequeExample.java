package com.bridgelabz.datastructure;


/*import java.util.*;

import java.util.Scanner;


class PalindromeChecker {

    public static void main(String[] args) {
    	 Deque<String> deque = new ArrayDeque<String>();
    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        

        for(String s:deque){  
            System.out.println(s);  
        }  
        String reverseString = "";

        while (deque.isEmpty()) {
            reverseString = reverseString+deque.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
*/

import java.util.*;  
public class DequeExample {  
	public static void main(String[] args) {  
		
		Deque<String> deque=new ArrayDeque<String>();  
		deque.add("arvind");  
		deque.add("vimal");  
		deque.add("mukul");  
		deque.add("jai");  
		
		System.out.println("After First Traversal...");  
		for( String s :deque){  
			System.out.println(s);  
			
		}  
		Iterator itr=deque.descendingIterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}  
}  






