package com.awa.structure;

import com.awa.structure.adapters.IShape;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AwaAnimation extends Animation {
	
	private boolean isLoop;
	private short status;
	
	public static final short PLAYING = 1;
	public static final short PAUSED = PLAYING + 1;
	public static final short STOPED = PAUSED + 1;

	private float lastTimeDrawed;
	
	private IShape bounds;

	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames, IShape bounds) {
		super(frameDuration, keyFrames);
		this.isLoop = false;
		this.status = PAUSED;
		this.lastTimeDrawed = 0;
		this.bounds = bounds;
	}
	
	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames) {
		super(frameDuration, keyFrames);
		this.isLoop = false;
		this.status = PAUSED;
		this.lastTimeDrawed = 0;
	}
	
	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames, boolean isLoop, IShape bounds) {
		super(frameDuration, keyFrames);
		this.isLoop = isLoop;
		this.status = PAUSED;
		this.lastTimeDrawed = 0;
		this.bounds = bounds;
	}
	
	
	/** Returns a {@link Sprite} instead of a {@link TextureRegion} to draw it whit the sprite methods 
	 * 
	 * @param stateTime the time spent in the state represented by this animation.
	 * @param looping whether the animation is looping or not.
	 * @return the TextureRegion representing the frame of animation for the given state time. */
	public Sprite getKeySprite(float stateTime, boolean looping) 
	{
		TextureRegion currentFrame = this.getKeyFrame(stateTime , looping);
		Sprite currentSprite = new Sprite(currentFrame);
		return currentSprite ;
	}
	
	/** Returns the {@link Sprite} to draw without any parameters 
	 * */
	public Sprite getKeySprite() 
	{
		Sprite currentSprite;
		
		switch (getStatus()){
		case PAUSED:
			currentSprite = getKeySprite(this.lastTimeDrawed , isLoop());
			break;
		default :
			this.lastTimeDrawed += Gdx.graphics.getDeltaTime(); 
			currentSprite = getKeySprite(this.lastTimeDrawed , isLoop());
			break;
		}
		return currentSprite ;
	}
	
	public void play()
	{
		setStatus(PLAYING);
	}

	public void pause()
	{
		setStatus(PAUSED);
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
		return  getKeySprite() ; 
	}

	public short getStatus() {
		return status;
	}


	public void setStatus(short status) {
		this.status = status;
	}
	
	public IShape getBounds() {
		return bounds;
	}

	public void setBounds(IShape bounds) {
		this.bounds = bounds;
	}

}
