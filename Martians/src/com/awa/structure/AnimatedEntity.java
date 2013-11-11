	package com.awa.structure;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.Sprite;


public class AnimatedEntity extends PlayableEntity {

	final ArrayList<AwaAnimation> animations;
	private AwaAnimation currentAnimation; 
	

	public AnimatedEntity(float x, float y, float width, float height , ArrayList<AwaAnimation> animations) {
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
		Sprite currentSprite  = this.getCurrentAnimation().getKeySprite();
		currentSprite.setPosition(this.getPosition().x, this.getPosition().y);
		setShape(this.getCurrentAnimation().getBounds());
		
		return currentSprite;
	}
		
	public void pauseCurrentAnimation()
	{
		this.getCurrentAnimation().pause();
	}
	
	public void addAnimation(AwaAnimation animation)
	{
		this.animations.add(animation);
	}

}
