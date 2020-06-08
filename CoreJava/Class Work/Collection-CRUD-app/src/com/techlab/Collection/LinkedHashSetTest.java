package com.techlab.Collection;

import java.io.*;
import java.util.*;

public class LinkedHashSetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		LinkedHashSet<String> players = new LinkedHashSet<String>();

		players.add("Pele");
		players.add("Maradona");
		int choice = 0;

		do {

			System.out.println("\nLinkedHashSet Operations Demo: Building Soccer Team");

			System.out.println("0 : Display players list");

			System.out.println("1 : Add player");
			System.out.println("2 : Remove player");
			System.out.println("3 : Change player");
			System.out.println("4 : Exit");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			String name;
			int position;

			switch (choice) {
			case 0:
				System.out.println("\nPlayers currently in ArrayList are ");
				Iterator<String> it = players.iterator();
				while (it.hasNext()) {
					System.out.println(it.next() + " ");
				}
				break;
			case 1:
				System.out.println("Enter player name");
				name = br.readLine();

				players.add(name);
				break;
			case 2:
				System.out.println("Enter player name to remove");
				name = br.readLine();
				players.remove(name);
				break;
			case 3:
				System.out.println("Enter the name of player to change");
				String modify = br.readLine();
				System.out.println("Enter player name");
				name = br.readLine();
				for (String i : players)
					if (i.equalsIgnoreCase(modify)) {
						players.remove(i);
						players.add(name);
						break;
					}
				break;
			default:
				System.out.println("Exiting program");
				return;
			}

		} while (choice < 3 && choice >= 0);
	}
}
