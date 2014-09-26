package org.sraj;

import java.util.Random;

public class MontyHall {

	public static void main(String[] args) {
		Random rnd = new Random();
		int switchWins = 0, NoSwitchWins = 0;
		
		for(int i =0; i<3200; i++){
			int prizeD = rnd.nextInt(3);
			int guessD = rnd.nextInt(3);
			int showD = getSwitchDoor(prizeD, guessD, rnd);
			
			if(guessD==prizeD) NoSwitchWins++;
//			else if(switchD==prizeD) switchWins++;
		}

		System.out.println("switchWins = " + switchWins + ", NoSwitchWins = " + NoSwitchWins);
	}

	private static int getSwitchDoor(int prizeD, int guessD, Random rnd) {
		while(true){
			int switchD = rnd.nextInt(3);
			if( (switchD != prizeD) && (switchD != guessD))
				return switchD;
		}
	}
}