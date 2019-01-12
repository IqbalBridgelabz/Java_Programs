package com.bridgelabz.datastructure;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Scanner;




public class File  {

	public static String ll;
	public static void main(String[] args) throws Exception {
		File f = new File();
		Scanner sc = new Scanner(new FileReader("test.txt"));
		while(sc.hasNext())
		{	
			ll = sc.nextLine();
			//System.out.println(s);

		}
		String[] str = ll.split(" ");
		for(String str1:str) {
			Collection.sort(str1);
			System.out.println(str1);
			
		}
	
	
	}
	

}

