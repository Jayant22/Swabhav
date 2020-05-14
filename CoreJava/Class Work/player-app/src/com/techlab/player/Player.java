package com.techlab.player;

public class Player {
	
	private int id;
	private String name;
	private int age;
	private int score;

	Player(int id,String name,int age)
	{
	   this.id=id;
	   this.name=name;
	   this.age=age;

	}
	Player(int id,String name,int age,int score)
	{
	   this(id, name, age);
	   this.score=score;
	}

	public static void display(Player p) {
		System.out.println("Id:" + p.id + "\nName:" + p.name + "\nAge:" + p.age + "\nScore:" + p.score);
	}

	public static void main(String[] args) {
		
		Player p1 = new Player(101,"xyz",24);
		
		Player p3 = new Player(103,"pqr",26,1000);
		
		Player p2 = new Player(102,"abc",25,2000);
		
		display(p1);
		display(p2);
		display(p3);
	}

}
