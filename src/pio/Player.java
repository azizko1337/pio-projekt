package pio;

import java.util.Random;

public class Player {
	final private Random brain = new Random();
	private String name;
	
	public int guess() {
		return brain.nextInt(6) + 1;
	}
	
	public void setName(String name) {
		if(name == null || name.length() == 0) System.out.println("BLAD: nazwa powinna byc dluzsza od 0");
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}