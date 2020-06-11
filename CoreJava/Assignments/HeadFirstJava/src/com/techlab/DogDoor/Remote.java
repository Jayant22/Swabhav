package com.techlab.DogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private DogDoor door;
	
	public Remote(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		System.out.println("Remote control button is pressed");
		if(door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				door.close();
				timer.cancel();
			}
		}, 5000);
	}
	
}
