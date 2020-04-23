package com.techlab.week1.Assignment1;

import java.util.StringTokenizer;

public class StrTest {
	
	public static void Splits(String str, int limit) {
		String strCom = "",strOri = "",strTra = "";
				
		StringTokenizer multiTokenizer = new StringTokenizer(str, "//.@?=");
		int index = 0;
		String[] arrays = new String[multiTokenizer.countTokens()];
		
		while (multiTokenizer.hasMoreElements()) {
			String i = multiTokenizer.nextToken();
			//for (int index = 0; index < arrays.length; index++) 
			arrays[index] = i;
			index++;	
		}
		
		strOri = arrays[1];
		strCom = arrays[3];
		strTra = arrays[5];
		
		if (strCom != null && strOri != null && strTra != null) {
			System.out.println("Company Name::"+ strCom);
			System.out.println("Training Origin::"+ strOri);
			System.out.println("Training Name::"+ strTra);
		}
		else if (strCom == null) {
			System.out.println("Company Name::"+ null);
			System.out.println("Training Origin::"+ strOri);
			System.out.println("Training Name::"+ strTra);
		}
		else if (strOri == null){
			System.out.println("Company Name::"+ strCom);
			System.out.println("Training Origin::"+ null);
			System.out.println("Training Name::"+ strTra);
		}
		else if (strTra == null){
			System.out.println("Company Name::"+ strCom);
			System.out.println("Training Origin::"+ strOri);
			System.out.println("Training Name::"+ null);	
		}
		else {
			System.out.println("Company Name::"+ null);
			System.out.println("Training Origin::"+ null);
			System.out.println("Training Name::"+ null);
		}
		
	}

	public static void main(String[] args) {
		String str = "www.techlab.com@swabhavtechlabs?traing=java";
		int limit = 5;
		
		System.out.println(str);
		
		Splits(str,limit);
		
		
	}

}
