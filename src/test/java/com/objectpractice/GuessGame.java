package com.objectpractice;
import java.lang.reflect.Constructor;

import com.objectpractice.Player;

public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//Varirous ways of creating an object
	 GuessGame obj = new GuessGame ();
	 GuessGame obj1 = (GuessGame) Class.forName("org.programming.mitra.exercises.Employee").newInstance();
	 GuessGame obj2 = GuessGame.class.newInstance();
	 Constructor<GuessGame> constructor = GuessGame.class.getConstructors()P
	 GuessGame obj3 = constructor.newInstance();
	}
	
	//public static void main(String [] args) {
	public void createPlayerClassobjects() {
		int guess1 = 0;
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		p1.guessNumber();
		guess1 = p1.number;
		System.out.println(guess1);
	}

}
