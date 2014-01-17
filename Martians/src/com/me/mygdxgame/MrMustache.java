package com.me.mygdxgame;

import java.util.ArrayList;

import com.awa.structure.AnimatedEntity;
import com.awa.structure.AwaAnimation;

public class MrMustache extends AnimatedEntity{

	private int lives;
	private ArrayList<Weapon> weapons;
	private Weapon currentWeapon;
	private int resistance;
	private int score;
	private int money;
	
	
	
	public MrMustache(float x, float y, float width, float height,
			ArrayList<AwaAnimation> animations) {
		super(x, y, width, height, animations);
		// TODO Auto-generated constructor stub
	}

	public void dropWeapon(Weapon weapon){
		this.weapons.remove(weapon);
	}
	
	public void pickUpWeapon(Weapon weapon){
		this.weapons.add(weapon);
	}
	
	public Weapon getCurrentWeapon(){
		return this.currentWeapon;
	}
	
	public ArrayList<Weapon> getWeapons(){
		return this.weapons;
	}
	
	public void fire(){
		if(!getCurrentWeapon().isEmpty()){
			getCurrentWeapon().fire();
		}
	}
	
	public void setCurrentWeapon(Weapon weapon){
		this.currentWeapon = weapon;
	}
	
	public void loadWeapon(Weapon weapon, int amount){
		weapon.load(amount);
	}
	
	public void jump(){
		
	}
	
	public void move(){
		
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public int getMoney(){
		return this.money;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public void catchCoin(Coin coin){
		setMoney(getMoney()+coin.getValue());
	}
}
