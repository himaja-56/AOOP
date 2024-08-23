package com.game;

public class EasyGameElementsFactory implements GameElementsFactory {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new EasyWeapon();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new EasyPowerUp();
	}

}
