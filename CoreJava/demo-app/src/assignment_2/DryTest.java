package assignment_2;

public class DryTest {
	
	public static void main(String[] args) {
		
		int a = 10,b = 10,total = 0;
		double avg = 0;
		WithoutDryTest test_1 = new WithoutDryTest();
		WithDryTest test_2 = new WithDryTest();
		
		total = test_1.total(a, b);
		avg = test_1.average(a, b);
		
		System.out.println("Sum = " + total + "\n" + "Avg = " + avg);
		
		total = test_2.total(a, b);
		avg = test_2.average(a, b);
		
		System.out.println("Sum = " + total + "\n" + "Avg = " + avg);
	}
}

class WithoutDryTest{
	
	public int total(int a, int b) {
		int sum =  a + b;
		System.out.println("Total=" + sum);
		
		return sum;
	}
 
	public double average(int a, int b) {
		int sum = a + b;
		System.out.println("Total=" + sum);
		
		return sum / 2;
	}
}

class WithDryTest{
	
	public int total(int a, int b) {
		int sum =  a + b;
		System.out.println("Total=" + sum);
		
		return sum;
	}
 
	public double average(int a, int b) {
		int sum = total(a, b);
		
		return sum / 2;
	}
}



