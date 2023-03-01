/*
 * Purpose: The purpose of this adventure class is to serve as a main method where the program will run.
 * The concept behind this class is that it will repeatedly loop until two conditions are met where 
 * either the player gets eaten by a grue or player finds the treasure 
 *
 */

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		Player player = new Player(); // creates new object called 'player'
		Map playerMap = new Map(); // creates new object called 'playerMap'
		String playerInput;
		Lamp playerLamp; // creates a Lamp class called 'playerLamp'
		Key playerKey; // creates a Key class called 'playerKey'
		
		player.setX(0); // sets the x coordinate of object player
		player.setY(0); // sets the y coordinate of object player
		
		System.out.println("Welcome to UGA Adventures: Episode 1\n" 
								+ "The adventure of the Cave of Redundancy Adventure\n"
								+ "By: Joo Young Kang\n"); // print the introduction
		
		System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // print the room object from map when player moves with descriptions
		
		boolean whileLoop = true; // setting a boolean 'whileLoop' to true
		
		while(whileLoop) { // while condition is 'whileLoop'
			
			Scanner keyboard = new Scanner(System.in); // creates scanner called 'keyboard'
			
			playerInput = keyboard.nextLine(); // String 'playerInput' equals the scanner keyboard input
			
			// GET LAMP method
			if(playerInput.equalsIgnoreCase("GET LAMP")) { // if condition when user input equals "GET LAMP"
				
				if(playerMap.getRoom(player.getX(),player.getY()).getLamp() != null) { // if condition of room object from map when player moves retrieving lamp equals a null value
					System.out.println("OK"); 
					player.setLamp(playerMap.getRoom(player.getX(),player.getY()).getLamp()); // set player's lamp to 'getLamp' from a room object
					playerMap.getRoom(player.getX(), player.getY()).clearLamp(); // clear lamp within a room object from map
				}
				else {
					System.out.println("No lamp present"); // if condition is false, then print
				}
			}
			
			// LIGHT LAMP method
			else if(playerInput.equalsIgnoreCase("LIGHT LAMP")) { // if condition when user input equals "LIGHT LAMP"
				if(player.getLamp() != null) { // player's lamp does not equal a null value
					System.out.println("OK"); 
					player.getLamp().setIsLit(true); // set player's lamp is true 
				}
				else {
					System.out.println("You don't have the lamp to light"); // if condition is false, then print
				}
			}
			
			// NORTH method
			else if(playerInput.equalsIgnoreCase("NORTH")) { // if condition when user inputs equals "NORTH"
				if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true && 
					(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
					System.out.println("You have stumbled into a passing grue, and have been eaten"); 
					whileLoop = false; // 'whileLoop' equals false
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoNorth() == false) { // else if condition player moving north condition is false
					System.out.println("Can't go that way");
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoNorth() == true) { // else if condition player moving north condition is true
					player.setX(player.getX()-1); // set player x coordinate minus 1
					if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
							(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // if condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
								System.out.println("“It is pitch black, you can't see anything. You may be eaten by a grue!”");
					}
					else {
					System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // else condition shows room object from map with description
					}
				}
			}
			
			// SOUTH method
			else if(playerInput.equalsIgnoreCase("SOUTH")) { // if condition when user inputs equal "SOUTH"
				if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true && 
					(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
					System.out.println("You have stumbled into a passing grue, and have been eaten");
					whileLoop = false; // 'whileLoop' equals false
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoSouth() == false) { // else if condition player moving south condition is false
					System.out.println("Can't go that way");
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoSouth() == true) { // else if condition player moving south condition is true
					player.setX(player.getX()+1);
					if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
							(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // if condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
								System.out.println("“It is pitch black, you can't see anything. You may be eaten by a grue!”");
					}
					else {
					System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // else condition shows room object from map with description
					}
				}
			}
			
			// EAST method
			else if(playerInput.equalsIgnoreCase("EAST")) { // if condition when user inputs equal "EAST" 
				if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
					(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
					System.out.println("You have stumbled into a passing grue, and have been eaten");
					whileLoop = false; // 'whileLoop' equals false
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoEast() == false) { // else if condition player moving east condition is false
					System.out.println("Can't go that way");
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoEast() == true) { // else if condition player moving east condition is true
					player.setY(player.getY()+1);
					if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
							(player.getLamp() == null || player.getLamp().getIsLit() == false)) { // if condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
								System.out.println("“It is pitch black, you can't see anything. You may be eaten by a grue!”");
					}
					else {
					System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // else condition shows room object from map with description
					}
				}
			}
			
			// WEST method
			else if(playerInput.equalsIgnoreCase("WEST")) {
				if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true && 
						(player.getLamp() == null || player.getLamp().getIsLit() == false)) {  // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
						System.out.println("You have stumbled into a passing grue, and have been eaten");
						whileLoop = false; // 'whileLoop' equals false
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoWest() == false) { // else if condition player moving west condition is false
					System.out.println("Can't go that way");
				}
				else if(playerMap.getRoom(player.getX(),player.getY()).canGoWest() == true) { // else if condition player moving west condition is true
					player.setY(player.getY()-1);
					if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
							(player.getLamp() == null || player.getLamp().getIsLit() == false)) {  // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
								System.out.println("“It is pitch black, you can't see anything. You may be eaten by a grue!”");
				}
					else {
						System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // else condition shows room object from map with description
					}
				}
			
			}
			
			// LOOK method
			else if(playerInput.equalsIgnoreCase("LOOK")) {
				if(playerMap.getRoom(player.getX(),player.getY()).isDark() == true &&
						(player.getLamp() == null || player.getLamp().getIsLit() == false)) {  // If condition when room object is dark equals true and player's lamp equals null value and lamp lit condition equals false
					System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
				}
				else {
					System.out.println(playerMap.getRoom(player.getX(), player.getY()).getDescription()); // else condition prints room object from map with description
					
					if(playerMap.getRoom(player.getX(),player.getY()).getLamp() != null) { // if condition when room object from map and player has lamp does not equal null value
						System.out.println("There is an old oil lamp that was made long ago here.");
					}
					else if(playerMap.getRoom(player.getX(),player.getY()).getKey() != null) { // else if condition when room object from map and player has key does not equal null value
						System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
					}
					else if(playerMap.getRoom(player.getX(),player.getY()).getChest() != null) { //  else if condition when room object from map and player has gets chest does not equal null value
						System.out.println("There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it");
					}
				}
				System.out.print("Exits are: "); // print exit
				
					if(playerMap.getRoom(player.getX(),player.getY()).canGoNorth() == true) { // if condition when player can go north condition equals true
						System.out.println("north");
					}
					if(playerMap.getRoom(player.getX(),player.getY()).canGoSouth() == true) { // if condition when player can go south condition equals true
						System.out.println("south");
					}
					if(playerMap.getRoom(player.getX(),player.getY()).canGoEast() == true) { // if condition when player can go east condition equals true
						System.out.println("east");
					}
					if(playerMap.getRoom(player.getX(),player.getY()).canGoWest() == true) { // if condition when player can go west condition equals true
						System.out.println("west");
					}
			}
			
			// GET KEY method
			else if(playerInput.equalsIgnoreCase("GET KEY")) { // else if condition equals "GET KEY"
				if(playerMap.getRoom(player.getX(),player.getY()).getKey() != null) { // if condition when room object from map and player has keys does not equal null
					player.setKey(playerMap.getRoom(player.getX(),player.getY()).getKey()); // player set room object from map and player has keys
					playerMap.getRoom(player.getX(),player.getY()).clearKey(); // map set room object from map and clear the player key
					System.out.println("OK");
				}
				else {
					System.out.println("No key present");
				}
			}
			
			// OPEN CHEST method
			else if(playerInput.equalsIgnoreCase("OPEN CHEST")) { // else if condition equals "OPEN CHEST"
				if(playerMap.getRoom(player.getX(),player.getY()).getChest() != null) { // if condition when room object from map and player gets chest with locked condition does not equal null value
					if((playerMap.getRoom(player.getX(),player.getY()).getChest()).isLocked() == false) { // if condition when room object from map player gets chest with locked condition does not equal false
						System.out.println((playerMap.getRoom(player.getX(),player.getY()).getChest()).getContents());
						whileLoop = false; // 'whileLoop' equals false
					}
					else if((playerMap.getRoom(player.getX(),player.getY()).getChest()).isLocked() == true){ // if condition when room object from map and player gets chest with locked condition equals true
						System.out.println("The chest is locked");
					}
					
				}
				else {
					System.out.println("No chest present");
				}
				
			}
			
			// UNLOCK CHEST method
			else if(playerInput.equalsIgnoreCase("UNLOCK CHEST")) { // else if condition equals "UNLOCK CHEST"
				if(player.getKey() != null) { // if condition when player has keys does not equal null value
					player.getKey().use((playerMap.getRoom(player.getX(),player.getY()).getChest())); // player has key use room object from map and has chest
					System.out.println("OK");
				}
				else if(player.getKey() == null) { // else if player has key condition equals null
					System.out.println("Need a key to do any unlocking!");
				}
				else {
					System.out.println("No chest to unlock");
				}
				
			}
			
			// anything else
			else {
				System.out.println("I'm sorry I don't know how to do that"); // if the player input does not equal any of the above then it prints this 
			}
			
		} // while loop end
		// the loop ends when "whileLoop" equals a false condition
	}
	
}
