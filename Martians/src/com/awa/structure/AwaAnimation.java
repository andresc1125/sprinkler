package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AwaAnimation extends Animation {
	
	private boolean isLoop;

	private float lastTimeDrawed;

	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames) {
		
		super(frameDuration, keyFrames);
		// TODO Auto-generated constructor stub
	}
	
	
	/** Returns a {@link Sprite} instead of a {@link TextureRegion} to draw it whit the sprite methods 
	 * 
	 * @param stateTime the time spent in the state represented by this animation.
	 * @param looping whether the animation is looping or not.
	 * @return the TextureRegion representing the frame of animation for the given state time. */
	public Sprite getKeySprite(float stateTime, boolean looping) 
	{
		TextureRegion currentFrame = super.getKeyFrame(stateTime , looping);
		Sprite currentSprite = new Sprite(currentFrame);
		lastTimeDrawed = System.currentTimeMillis();
		isLoop = false;
		return currentSprite ;
	}
	
	public Sprite getKeySprite() 
	{
		float actualTime = System.currentTimeMillis();
		float deltaTime = actualTime - getLastTimeDrawed();
		setLastTimeDrawed(actualTime);
		TextureRegion currentFrame = super.getKeyFrame(deltaTime , isLoop());
		Sprite currentSprite = new Sprite(currentFrame);
		
		//de aca para alla esta quemado
		currentSprite.setSize(0.3f, 0.3f * currentSprite.getHeight() / currentSprite.getWidth());
		currentSprite.setOrigin(currentSprite.getWidth()/2, currentSprite.getHeight()/2);
		currentSprite.setPosition(-currentSprite.getWidth()/2, -currentSprite.getHeight()/2);
		return currentSprite ;
	}
	
	public void play()
	{
		lastTimeDrawed = System.currentTimeMillis();
	}

	public boolean isLoop() {
		return isLoop;
	}


	public void setLoop(boolean isLoop) {
		this.isLoop = isLoop;
	}


	public float getLastTimeDrawed() {
		return lastTimeDrawed;
	}


	public void setLastTimeDrawed(float lastTimeDrawed) {
		this.lastTimeDrawed = lastTimeDrawed;
	}
	
	public Sprite getSpriteToDraw() {
		Sprite temp = getKeySprite();
		temp.setPosition(10, 10);
		return temp ; 
	}
}
