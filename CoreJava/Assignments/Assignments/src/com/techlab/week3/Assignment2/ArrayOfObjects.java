package com.techlab.week3.Assignment2;

public class ArrayOfObjects {
	
	//do in oop;
	//how array of ojects are diff. from normal arr.

	public static void main(String args[]) {
		int Num = 3;
		
		Account obj[] = new Account[Num];
		
		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Account();
		}
		
		for (int i = 0; i < obj.length; i++) {
			obj[i].setData(i+1, i+2);
		}
		
		for (int i = 0; i < obj.length; i++) {
			
			System.out.println("For Array Element " + i);
			obj[i].showData();
			
		}
	}
}

class Account {
	int a;
	int b;

	public void setData(int c, int d) {
		a = c;
		b = d;
	}

	public void showData() {
		System.out.println("Value of a =" + a);
		System.out.println("Value of b =" + b);
	}
}
