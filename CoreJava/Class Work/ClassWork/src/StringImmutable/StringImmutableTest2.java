package StringImmutable;

public class StringImmutableTest2 {

	public static void main(String[] args) {
		
		 String foo="FOO";
		 String bar="BAR";
		 String foo1="BAR";
		  
		 System.out.println(foo);
		 System.out.println(bar);
		 
		 System.out.println(foo == bar);
		 System.out.println(bar == foo);
		 
		 System.out.println(foo.equals(bar));
		 System.out.println(bar.equals(foo));
		 
		 System.out.println(foo1==foo);
		 System.out.println(foo1==bar);
	}
}
