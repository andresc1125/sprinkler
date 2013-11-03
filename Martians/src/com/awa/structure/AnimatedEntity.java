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
		Sprite currentSprite  = this.getCurrentAnimation().getKeySprite();
		currentSprite.setSize(0.1f, 0.1f * currentSprite.getHeight() / currentSprite.getWidth());
		currentSprite.setOrigin(currentSprite.getWidth()/2, currentSprite.getHeight()/2);
//		currentSprite.setPosition(-0f, -0f);
//		System.out.println(-currentSprite.getWidth() + "width " + -currentSprite.getHeight()+ "heigth");
//		currentSprite.setBounds(0.2f, 0.2f, currentSprite.getWidth(),currentSprite.getHeight());
		return currentSprite;
	}
	
	@Override
	public void dispose(){
		this.currentAnimation.getKeySprite().getTexture().dispose();
	}
	
	public void stopCurrentAnimation()
	{
		this.getCurrentAnimation().play();
	}
	
	public void pauseCurrentAnimation()
	{
		this.getCurrentAnimation().play();
	}

}
