package com.bridgelabz.functional;


import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray{
    
	  
		public static void main(String args[]){ 
			PrintWriter pw = new PrintWriter(System.out,true);
			Scanner sc=new Scanner(System.in);
			pw.println("Enter rows for 2D array :\t");
			int M = sc.nextInt(); 
			pw.println("Enter columns for 2D array :\t");
			int N = sc.nextInt(); 
			pw.println("Enter array elements : ");
			twoDarray(M, N);
			}
		
		public static Integer twoDarray(int M,int N)
		{		
			PrintWriter printwriter = new PrintWriter(System.out, true);
			Scanner sc=new Scanner(System.in);
			int[][] array = new int[M][N];
			for(int i=0;i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					array[i][j]=sc.nextInt(); 
				}
			}
			printwriter.println("2D array : \n");
			for(int i=0;i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					printwriter.print(array[i][j]+" ");
				}
				printwriter.println( );
			}
			
			return null;
		}
	} 

   
    

 