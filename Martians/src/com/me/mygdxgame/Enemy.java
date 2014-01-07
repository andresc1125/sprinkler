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

	
}
