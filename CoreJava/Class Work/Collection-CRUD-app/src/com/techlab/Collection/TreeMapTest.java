package com.techlab.Collection;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> players = new TreeMap<Integer, String>();

		int counter = 0;
		players.put(counter++, "Pele");
		players.put(counter++, "Maradona");
		int choice = 0;

		do {

			System.out.println("\nTreeMap Operations Demo: Building Soccer Team");

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
				Set<Entry<Integer, String>> entries = players.entrySet();
				for (Map.Entry entry : entries)
					System.out.println(entry.getKey() + " : " + entry.getValue());
				break;
			case 1:
				System.out.println("Enter player name");
				name = br.readLine();

				players.put(counter++, name);
				break;
			case 2:
				System.out.println("Enter Position of player");
				position = Integer.parseInt(br.readLine());
				players.remove(position);
				break;
			case 3:
				System.out.println("Enter the Key of player ");
				int modify = Integer.parseInt(br.readLine());
				System.out.println("Enter player name");
				name = br.readLine();
				players.put(modify, name);
				break;
			default:
				System.out.println("Exiting program");
				return;
			}

		} while (choice < 3 && choice >= 0);
	}
}
