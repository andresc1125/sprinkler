package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AwaAnimation extends Animation {
	
	private boolean isLoop;
	private short status;
	
	public static final int PLAYING = 1;
	public static final int PAUSED = PLAYING + 1;
	public static final int STOPED = PAUSED + 1;
	

	private long lastTimeDrawed;

	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames) {
		super(frameDuration, keyFrames);
		isLoop = false;
		status = STOPED;
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
	
		currentSprite.setSize(0.1f, 0.1f * currentSprite.getHeight() / currentSprite.getWidth());
		currentSprite.setOrigin(currentSprite.getWidth()/2, currentSprite.getHeight()/2);
		currentSprite.setPosition(-currentSprite.getWidth(), -currentSprite.getHeight());
		return currentSprite ;
	}
	
	public Sprite getKeySprite() 
	{	
		long actualTime = System.currentTimeMillis();
		long deltaTime = actualTime - getLastTimeDrawed();
		deltaTime = deltaTime / 1000;
//		System.out.println("el tiempo delta va en "+ deltaTime);
		//System.out.println("el tiempo actual e milis " + System.currentTimeMillis());
		TextureRegion currentFrame = super.getKeyFrame(deltaTime , true);
		Sprite currentSprite = new Sprite(currentFrame);
		
		//de aca para alla esta quemado
		currentSprite.setSize(0.1f, 0.1f * currentSprite.getHeight() / currentSprite.getWidth());
		currentSprite.setOrigin(currentSprite.getWidth()/2, currentSprite.getHeight()/2);
		currentSprite.setPosition(-currentSprite.getWidth()/2, -currentSprite.getHeight()/2);
		return currentSprite ;
	}
	
	public void play()
	{
		setLastTimeDrawed(System.currentTimeMillis());
		this.status = PLAYING;
	}

	public boolean isLoop() {
		return isLoop;
	}


	public void setLoop(boolean isLoop) {
		this.isLoop = isLoop;
	}


	public long getLastTimeDrawed() {
		return lastTimeDrawed;
	}


	public void setLastTimeDrawed(long lastTimeDrawed) {
		this.lastTimeDrawed = lastTimeDrawed;
	}
	
	public Sprite getSpriteToDraw() {
		Sprite temp = getKeySprite();
		temp.setPosition(10, 10);
		return temp ; 
	}
}
