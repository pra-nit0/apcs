import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot r; 


	// You will add very many variables!!

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */

    String wrldName = "basicRoom.wld";

	World.readWorld(wrldName);
    World.setVisible(true);
	int largest_pile = 0;
	int piles = 0;
	double total = 0;
	double length = 0;
	double width = 0;
	Robot r = new Robot(11,6,East,0);
	World.setDelay(1);

    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
	boolean walls = r.frontIsClear();
	for (int i = 0; i<1;){
		length = 0;
		while (walls == true){
			r.move();
			length++;
			boolean scan = r.nextToABeeper();
			int beepers = 0;
			while (scan == true){
				r.pickBeeper();
				total++;
				scan = r.nextToABeeper();
				beepers++;
				if (beepers > largest_pile){
					largest_pile = beepers;
					beepers = 0;
				}
				
			
			}
			walls = r.frontIsClear();
		}
		boolean FaceEast = r.facingEast();
		boolean FaceWest = r.facingWest();
		boolean FaceNorth = r.facingNorth();
		if (walls == false){
			if (FaceEast==true){
				r.turnLeft();
				r.turnLeft();
				r.turnLeft();
				walls = r.frontIsClear();
				if (walls == true){
					width++;
					r.move();
					r.turnLeft();
					r.turnLeft();
					r.turnLeft();
					walls = r.frontIsClear();
				} else {
					width++;
					System.out.println("Total Beepers: " + total + " beepers");
					System.out.println("The largest pile's size: " + largest_pile + " beepers");
					System.out.println("Area of Room: " + (length*width));
					System.out.println("Percent room dirty: " + (total/(length*width)));
				}
				}
			else if (FaceWest==true){
				width++;
				r.turnLeft();
				r.move();
				r.turnLeft();
				walls = r.frontIsClear();
				}
			} 


				} 




  





  	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */










  }

}
