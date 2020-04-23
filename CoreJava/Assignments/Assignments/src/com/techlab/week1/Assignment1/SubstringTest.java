package com.techlab.week1.Assignment1;

public class SubstringTest {

	public static String substringdisplay(String str,int startindex) {
		
		String result = "";
		if (startindex<0) {
			return null;
		}
		result = str.substring(startindex);
		return result;
		
	}
	public static String substringdisplay(String str,int startindex,int endindex) {
		String result = "";
		if (startindex<0) {
			return null;
		}
		result = str.substring(startindex, endindex);
		return result;
	}
	
	public static void main(String[] args) {
		String str = "https://www.swabhavtechlabs.com?developer=Jayant", subStrCom = "",subStrName = "";
		int start_of_company_index=0,Last_of_company_index=0,start_of_name_index=0;
		
		if (str != null) {
			 start_of_company_index = str.indexOf("swabhavtechlabs");
			 start_of_name_index = str.indexOf("Jayant");
		}
		Last_of_company_index = start_of_company_index + "swabhavtechlabs".length();
		
		subStrCom = substringdisplay(str,start_of_company_index,Last_of_company_index);
		subStrName = substringdisplay(str,start_of_name_index);
		
		if (subStrCom != null && subStrName != null) {
			
			System.out.println("Company Name::"+ subStrCom);
			System.out.println("Developer Name::"+ subStrName);
		}
		else if (subStrCom != null && subStrName == null) {
			System.out.println("Company Name::"+ subStrCom);
			System.out.println("Developer Name::"+ null);
		}
		else if (subStrCom == null && subStrName != null){
			System.out.println("Company Name::"+ null);
			System.out.println("Developer Name::"+ subStrName);
		}
		else {
			System.out.println("Company Name::"+ null);
			System.out.println("Developer Name::"+ null);
		}
		
	}

}