/*
 *
 * Purpose: The purpose of this class is to store the chest condition(locked or unlocked) and the key that will meet the condition.
 * In addition, it will contain the contents within the chest that will influence whether the player wins or need to continue with the program (game).
 *
 */

public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */
	private Key correctKey; // private variable Key called 'correctKey'
	private boolean lock; // private boolean variable called 'lock'
	private String contents; // private String variable called 'contents'

	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) { // setter method; 'theKey' pass as parameter
		
		this.correctKey = theKey; // this'correctKey' equals to 'theKey'
		lock = true; // 'lock' equals true condition
		
	}
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) { // setter method; 'theKey' pass as parameter
		
		if(correctKey.equals(theKey)) { // if condition is 'correctKey' equals 'theKey'
			lock = false; // 'lock' equals false condition
			
		}
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() { // getter method
		
		if(lock == true) { // if condition comparing 'lock' equals true condition
			return true; // return true condition
		}
		else { 
			return false; // return false condition
			
		}
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() { // getter method
		
		return contents; // return variable called 'contents'
		
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) { // setter method; String variable called 'contents' passed
		
		this.contents = contents; // 'this.contents' equals contents
		
	}
}