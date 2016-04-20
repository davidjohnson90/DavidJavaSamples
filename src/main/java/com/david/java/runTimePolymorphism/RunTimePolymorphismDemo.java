/**
 * 
 */
package com.david.java.runTimePolymorphism;

/**
 * @author David
 *
 */
public class RunTimePolymorphismDemo {
	public static void main(String[] args) {
		Game game = new Game();
		Cricket cricket = new Cricket();
		game.gameType();
		cricket.gameType();
		game = cricket;
		game.gameType();
	}
}

class Game {
	/**
	 * 
	 */
	public void gameType() {
		System.out.println("Indoor and Outdoor Games");
	}
}

class Cricket extends Game {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.runTimePolymorphism.Game#gameType()
	 */
	@Override
	public void gameType() {
		System.out.println("Outdoor Game");
	}
}