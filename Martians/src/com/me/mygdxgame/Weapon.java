package com.me.mygdxgame;

public class Weapon {
	
	private int bulletAmount;
	private Bullet bullet;
	
	public Weapon(){
		
	}
	
	public void setBulletAmount(int amount){
		this.bulletAmount = amount;
	}
	
	public int getBulletAmount(){
		return this.bulletAmount;
	}
	
	public void fire(){
		//Luego vemos que meter aca
		setBulletAmount(getBulletAmount() - 1);
	}
	
	public void load(int bulletAmount){
		setBulletAmount(getBulletAmount() + bulletAmount);
	}
	
	public boolean isEmpty(){
		return bulletAmount == 0;
	}
}
