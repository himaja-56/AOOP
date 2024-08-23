package com.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameState gamestate = GameState.getInstance();
		gamestate.setDifficulty("Hard");
		
		EnemyFactory enemyfactory;
		GameElementsFactory elementsfactory;
		
		if(gamestate.getDifficulty().equals("Easy")) {
			enemyfactory = new EasyEnemyFactory();
		    elementsfactory = new EasyGameElementsFactory();
			
		}
		
		else {
			enemyfactory = new HardEnemyFactory();
			elementsfactory = new HardGameElementsFactory();
		}
		
		Enemy enemy = enemyfactory.createEnemy();
		enemy.attack();
		Weapon weapon = elementsfactory.createWeapon();
		weapon.use();
		PowerUp powerup = elementsfactory.createPowerUp();
		powerup.apply();
		gamestate.nextLevel();
		System.out.println("Level: "+ gamestate.getLevel());
		
	}

}
