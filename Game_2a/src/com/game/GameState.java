package com.game;

public class GameState {
	private static GameState singleInstance = null;
	private int level;
	private String difficulty;
	
	private GameState() {
		this.level = 1;
		this.difficulty = "Easy";
	}
	
	public static GameState getInstance() {
		if(singleInstance == null) {
			singleInstance = new GameState();
		}
		return singleInstance;
	}
	
	public void nextLevel() {
		level++;
	}
	
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty; 
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getDifficulty() {
		return difficulty;
	}

}
