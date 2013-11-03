package com.awa.structure;

import com.badlogic.gdx.Gdx;
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
		return currentSprite ;
	}
	
	public Sprite getKeySprite() 
	{
		TextureRegion currentFrame;
		Sprite currentSprite;
		
		switch (getStatus()){
		case STOPED : 
			this.lastTimeDrawed = 0; 
			currentFrame = super.getKeyFrame(this.lastTimeDrawed , isLoop());
			currentSprite = new Sprite(currentFrame);
		    break;
		default :
			this.lastTimeDrawed += Gdx.graphics.getDeltaTime(); 
			currentFrame = super.getKeyFrame(this.lastTimeDrawed , isLoop());
			currentSprite = new Sprite(currentFrame,50,20,currentFrame.getRegionWidth(),currentFrame.getRegionHeight());
			break;
		}
		return currentSprite ;
	}
	
	public void play()
	{
		setLastTimeDrawed(0);
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
	

	public void dispose(){
		getSpriteToDraw().getTexture().dispose();
	}

	public short getStatus() {
		return status;
	}


	public void setStatus(short status) {
		this.status = status;
	}

}
