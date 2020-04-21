package com.techlab.demo;

//import java.util.StringTokenizer;

public class SplitStringTest {
	
	public static String Splitstrings(String str) {
		String result = "";
		String[] array = str.split("\\.");
		int i=0;
		for(i=0;i<array.length;i++) {
			if (array[i].equals("swabhavtechlabs")) {
				result = array[i];
				break;
		}
		}
		if(result != null) {
			return result;
		}
		else {
			return null;
		}
		
	}
	public static String Splitstringss(String str, int limit) {
		String result = "";
		String[] array = str.split("\\.", limit),Array = null;
		int i=0;
		for(i=0;i<array.length;i++) {
			if (array[i].contains("Jayant")) {
				Array = array[i].split("=", limit);
				for(i=0;i<Array.length;i++) {
					if (Array[i].equals("Jayant")) {
						result = Array[i];
						break;
					}
				}
				break;
			}
		}
		if(result != null) {
			return result;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		String str = "https://www.swabhavtechlabs.com?developer=Jayant",strCom = "",strName = "";
		int limit = 5;
		
		System.out.println(str);
		
		strCom = Splitstrings(str);
		strName = Splitstringss(str,limit);
		
		if (strCom != null && strName != null) {
			
			System.out.println("Company Name::"+ strCom);
			System.out.println("Developer Name::"+ strName);
		}
		else if (strCom != null && strName == null) {
			System.out.println("Company Name::"+ strCom);
			System.out.println("Developer Name::"+ null);
		}
		else {
			System.out.println("Company Name::"+ null);
			System.out.println("Developer Name::"+ strName);
		}
	}
	
}
