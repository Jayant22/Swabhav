package com.techlab.TicTacToe;

import java.util.Objects;

public class Player {

	private String Name;
	private Mark mark;
	
	public Player(String Name, Mark mark) {
		this.Name = Name;
		this.mark = mark;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public Mark getMark() {
		return mark;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Player player = (Player) o;
	    return Objects.equals(Name, player.Name) &&
	            Objects.equals(mark, player.mark);
	}
	 
	@Override
	public int hashCode() {
	    return Objects.hash(Name, mark);
	}
}
