package assignment_2;

class Balloon {

	private String color;
	
	public Balloon(String c){
		this.color=c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
public class PassByValueTest {

	public static void main(String[] args) {
		Balloon red = new Balloon("Red"); 
		Balloon blue = new Balloon("Blue"); 
		
		swap(red, blue);
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		
		foo(blue);
		System.out.println("blue color="+blue.getColor());
		
	}

	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Red"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1=o2;
		o2=temp;
	}
}
