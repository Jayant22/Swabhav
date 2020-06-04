package com.techlab.Exception;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		
		try {
			m1();
			System.out.println("End of Program");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of Program");

	}

	 static void m1() throws Exception{
		System.out.println("M1 is Called");
		m2();
		
	}

	 static void m2() throws Exception{
		System.out.println("M2 is Called");
		m3();
	}

	 static void m3() throws Exception{
		System.out.println("M3 is Called");
		throw new Exception("There Is some Problem");
	}

}
