package com.orchid.test;

import java.util.*;

public class Transposition_Cipher_II {

	public static void main(String args[]){
		int i=0,j=0;int l1=0,l2=0,aa=0,a=0;
		char[] ch,k;
		char[][] t = new char[20][20];;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Plaintext String :: ");
		String str=sc.next();
		System.out.println("Enter key fro Encryption :: ");
		String key=sc.next();
		
		int q=(str.length())%(key.length());
		if(q!=0)
		{
			for(i=0;i<=q;i++)
			str+="x";
		}
		System.out.println("The Plaintext with AddOn of x ::\n" + str);
		
		ch=str.toCharArray();
		k=key.toCharArray();
		
		l1=ch.length;
		l2=k.length;
		
		for(i=0;i<l1;i++)
			if(ch[i]>=90){int tt=ch[i]-32;
			ch[i]=(char)tt;
			}
			
		for(j=0;j<l2;j++)
			t[0][j]=k[j];
		
		for(i=1;i< (l1/l2)+1;i++)
			for(j=0;j<l2;j++)
				t[i][j]=ch[aa++];
		
		System.out.println("\nThe Transpostion Matrix :: ");
		
		for(i=0;i<(l1/l2)+1;i++){
			for(j=0;j<l2;j++){
				System.out.print(" "+t[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("\nCipher Text :: ");
		for(i=0;i<l2;i++)
			for(j=1;j<(l1/l2)+1;j++)
				System.out.print(""+t[j][i]);
		
	}
}