package com.bridgelabz.algorithm;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="heart";
		String str2="earth";
		boolean b = anagramCheck(str1,str2);
		if(b==true)
			System.out.println("Both strings are angram:");
		else
			System.out.println("Both strings are not angram:");
	}
	
	public static boolean anagramCheck(String str1,String str2) {
		char[] s1 = str1.toCharArray(); 
		char[] s2 = str2.toCharArray();
		return Arrays.equals(s1, s2);
		
	}
}
