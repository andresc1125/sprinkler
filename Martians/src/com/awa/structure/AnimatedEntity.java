	package com.awa.structure;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;


public class AnimatedEntity extends PlayableEntity {

	final ArrayList<? extends AwaAnimation> animations;
	private AwaAnimation currentAnimation; 
	

	public AnimatedEntity(float x, float y, float width, float height , ArrayList<? extends AwaAnimation> animations) {
		super(x, y, width, height);
		this.animations = animations;
		this.currentAnimation = this.animations.get(0);
	}
	
	
	public AwaAnimation getCurrentAnimation() {
		return currentAnimation;
	}

	public void setCurrentAnimation(AwaAnimation currentAnimation) {
		this.currentAnimation = currentAnimation;
	}

	@Override
	public Sprite getSpriteToDraw() {
		return this.getCurrentAnimation().getKeySprite();
	}
	
	@Override
	public void dispose(){
		this.currentAnimation.getKeySprite().getTexture().dispose();
	}

}
