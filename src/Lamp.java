/*
 *
 * Purpose: The purpose of this class is store the lamp's condition in the lamp being lit or not.
 *
 */

public class Lamp {

	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	
	private boolean lightUp; // private boolean variable 'lightUp'
	
	public void setIsLit(boolean lit) { // setter method; passing boolean variable 'lit'
		
		this.lightUp = lit; // 'this.lightUp equals 'lit'
		
	}
	
	public boolean getIsLit() { // getter method
		
		return lightUp; // return 'lightUp'
		
	}

	
}