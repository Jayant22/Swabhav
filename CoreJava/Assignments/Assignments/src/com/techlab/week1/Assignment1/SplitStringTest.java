package com.techlab.week1.Assignment1;
/*
 * make dynamic 
 * it should work for foll. three cases
 * a. if both str present print as it is
 * b. if any one of value is missing then print null
 * c. create new class named as StrTest.java : use new query str = www.techlab.com@swabhavtechlabs?traing=java
 * d. expected op = company name = swabhavtechlabs training name = java origin name techlab 
 */
public class SplitStringTest {
	
	public static String Splitstrings(String str) {
		String result = "";
		String[] array = str.split("\\.");
		//int i=0;
		/*for(i=0;i<array.length;i++) {
			if (array[i].equals("swabhavtechlabs")) {
				result = array[i];
				break;
			}
		}*/
		result = array[1];

		if(result != null) {
			return result;
		}
		else {
			return null;
		}
		
	}
	public static String Splitstringss(String str, int limit) {
		String result = "";
		String[] array = str.split("\\.", limit), Array = null;
		//int i=0;
		/*for(i=0;i<array.length;i++) {
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
		}*/
		Array = array[2].split("=", limit);
		result = Array[1];
		
		if(result != null) {
			return result;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		String str = "https://www..com?developer=Jayant",strCom = "",strName = "";
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
		else if (strCom == null && strName != null){
			System.out.println("Company Name::"+ null);
			System.out.println("Developer Name::"+ strName);
		}
		else {
			System.out.println("Company Name::"+ null);
			System.out.println("Developer Name::"+ null);
		}
	}
}
