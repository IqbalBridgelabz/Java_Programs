package com.bridgelabz.datastructure;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	public void unorderedList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/home/admin1/Desktop/Iqbal/Bridgelabz/src/text.txt"));
		UnorderedLinkedList list = new UnorderedLinkedList();
		Scanner scanner = new Scanner(System.in);
		String str="";
			
		String[] words = null;
		while((str=br.readLine())!=null)
		{
			words=str.split(" ");			
		}
		for(int i=0;i<words.length;i++)
		{
			list.insert(words[i]); // insert file contents in linked list 
		}
	// from 27 to 37 for sorting in ascending order
		for(int i = 0; i<words.length-1; i++) {
         for (int j = i+1; j<words.length; j++) {
            if(words[i].compareTo(words[j])>0) {
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(words));
		
				
		
		
		//list.show();  //print linked list // uncomment it for unsorted order
		System.out.println("Enter data to be search : ");
		String search = scanner.next();
		list.search(search);   // search the key in linked list if found removed 
		// else add it in linked list
		
			
		list.show();
	}
}
