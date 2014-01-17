package com.me.mygdxgame;

import java.util.ArrayList;

import com.awa.structure.AnimatedEntity;
import com.awa.structure.AwaAnimation;

public class Enemy extends AnimatedEntity{

	private int power;
	private Weapon weapon;
	private int lives;
	
	public Enemy(float x, float y, float width, float height,
			ArrayList<AwaAnimation> animations) {
		super(x, y, width, height, animations);
		// TODO Auto-generated constructor stub
	}

	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public Weapon getWeapon(){
		return this.weapon;
	}
	
	public void fire(){
		if(!getWeapon().isEmpty()){
			getWeapon().fire();
		}
	}
	
	public void die(){
		if(this.lives == 0){
			//die
		}
	}
	
	public void move(){
		//Solo hacia adelante
	}
	
	public void jump(){
		
	}
	
	
}
