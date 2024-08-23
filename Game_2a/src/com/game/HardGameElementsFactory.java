package com.game;

public class HardGameElementsFactory implements GameElementsFactory{

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new HardWeapon();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new HardPowerUp();
	}

}
