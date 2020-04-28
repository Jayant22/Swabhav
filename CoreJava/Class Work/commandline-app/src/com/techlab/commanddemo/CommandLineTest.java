package com.techlab.commanddemo;

public class CommandLineTest {

	final static int modulasnumber = 2;
	static int[] even = new int[4];
	static int[] odd = new int[4];
	
	public static void fetchNumbers(String[] array) {
		int[] even = new int[10];
		int[] odd = new int[10];
		int j=0,k=0;
		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) % modulasnumber == 0) { 
				even[j] = Integer.parseInt(array[i]);
				j++;
			}
			else {
				odd[k] = Integer.parseInt(array[i]);
				k++;
			}
		}
		System.out.println("\nEven Numbers::");
		for (int i : even) {
			if (i != 0)
				System.out.print(i + " ");
		}
		System.out.println("\nOdd Numbers::");
		for (int i : odd) {
			if (i != 0)
				System.out.print(i + " ");
		}
	}
	public static void calculateAverage(String[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + Integer.parseInt(array[i]);
		}
		System.out.println("\nAverage Is::" + sum / array.length);
	}

	public static void calculatePercentage(String[] array) {
		
		double noofeven = 0.0, noofodd = 0.0;
		noofeven = even.length;
		noofodd = odd.length;
		System.out.println("Percentage of Even Number ::" + noofeven / array.length * 100);
		System.out.println("Percentage of Odd Number ::" + noofodd / array.length * 100);
	}

	public static void main(String[] args) {

		System.out.println("\nAll Integer Numbers");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		fetchNumbers(args);
		calculateAverage(args);
		calculatePercentage(args);
	}
}
/*OOPS:-Assignment1(theory)
1.Wat is oop?
2.why it is used?
3. wat is class and object
4.it is possible to change attribute and behaviour of objects at runtime
5. difference between compiler tym checking and runtime checking
6. wat are attributes of class
7. wat are ways of declaring objects
8.  difference between object and references
9. wat is encapsulations /why should be use it 
10. how can we achieve encapsulation in our program
11. wat all access specifiers are present in java ...try to find difference between them
12.learn about getters and setters .....find difference between them
13. learn concepts of constructor and its types 
14.difference between setters and constructor
15.learn concept of file reading and writing 


Assignment-2(Practical)

1.create one app as file-io-app----->com.techlab.fileio.test--->LogFileTest.java
i will send one log file to you ...you have to read information from that file and display it on console


command line- 
case 1: -e :- Error msg      case 2:-i:- Information       case 3 -w:- warning  case 4:- it should print everything



2. make your student.csv file 

101,abc,23,M
102,xyz,24,F
101,abc,23,M
101,abc,23,M


6 records 

 file-io-app----->com.techlab.fileio.test->FileReadingTest.java
requirements:-
1. you have to read data from file and print it on console



2. 101,abc,23,M

102,xyz,24,F
101,abc,23,M
101,abc,23,M


you have to read data from file and skip blank space



3.101,abc,23,null

102,xyz,24,F
101,null,23,M
101,abc,23,M

for null while displaying consider unspecified 
Expected output:-
101 abc 23 unspecified



Assignment 3:-
you have to complete next 2 cahpters of head first java
codemagnets and pool puzzle


Assignment 4:
solve pool puzzle of first 5 chapters from head first book






*/
