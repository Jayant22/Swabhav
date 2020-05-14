package com.techlab.week3.Assignment1;

import java.util.Scanner;

public class EvenNumberInRange {
	
	//private static Scanner scan;
	private final static int MOD = 2, low = 0;
	
	 public static void main(String []args)
	    {
	        int n=0,i=0;
	         
	        //scan = new Scanner(System.in);
	         
	        System.out.print("Enter value Number : ");
	        n = Integer.parseInt(args[0]);
	         
	        for(i=1; i<n; i++)
	        {
	            if(i % MOD == low)
	                System.out.print(i+" ");
	        }   

	        System.out.println();
	         
	    }

}
