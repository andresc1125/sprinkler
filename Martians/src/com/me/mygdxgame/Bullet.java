package com.me.mygdxgame;

import java.util.ArrayList;

import com.awa.structure.AnimatedEntity;
import com.awa.structure.AwaAnimation;

public class Bullet extends AnimatedEntity{

	private int damage;
	
	public Bullet(float x, float y, float width, float height,
			ArrayList<AwaAnimation> animations) {
		super(x, y, width, height, animations);
		// TODO Auto-generated constructor stub
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public int getDamage(){
		return this.damage;
	}
}
