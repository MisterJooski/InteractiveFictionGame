/*
 *
 * Purpose: The purpose of this class is to create a player object that will represent the user when the program runs.
 * The class will store the x and y coordinates of the player's movements and other factors such as the lamp and keys.
 *
 */


public class Player {
	// private classes
	private int x = 0; 
	private int y = 0;
	private Lamp userLamp;
	private Key userKey;
	
	public void setX(int x) { // setter method; passes int variable called 'x'
		
		this.x = x; // 'this.x' equals 'x'
		
	}
	
	public void setY(int y) { // setter method; passes int variabel called 'y'
		
		this.y = y; // 'this.y' equals 'y'
		
	}
	
	public void setLamp(Lamp lamp) { // setter method; passes Lamp variable called 'lamp'
		
		this.userLamp = lamp; // 'this.userlamp' equals 'lamp'
		
	}
	
	public void setKey(Key key) { // setter method; passes Key variable called 'key' 
		
		this.userKey = key; // 'this.userKey' equals 'key'
		
	}
	public int getX() { // getter method; 
		
		return x; // returns the variable called 'x'
		
	}
	
	public int getY() { // getter method;
		
		return y; // return the variable called 'y'
		
	}
	
	public Lamp getLamp() { // getter method
		
		return userLamp; // return the variable called 'userLamp'
		
	}
	
	public Key getKey() { // getter method
		
		return userKey; // return the variable called 'userKey'
		
	}
	
}
