package com.me.mygdxgame;

import java.util.ArrayList;

import com.awa.structure.AnimatedEntity;
import com.awa.structure.AwaAnimation;

public class Coin extends AnimatedEntity{

	private int value;
	
	public Coin(float x, float y, float width, float height,
			ArrayList<AwaAnimation> animations) {
		super(x, y, width, height, animations);
		// TODO Auto-generated constructor stub
	}

	public void setValue(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}
