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
	

	private float lastTimeDrawed;

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
		Sprite currentSprite;
		
		switch (getStatus()){
		case STOPED : 
			this.lastTimeDrawed = 0; 
			currentSprite= getKeySprite(this.lastTimeDrawed , isLoop());
		    break;
		default :
			this.lastTimeDrawed += Gdx.graphics.getDeltaTime(); 
			System.out.println("la la "+this.lastTimeDrawed);
			currentSprite = getKeySprite(this.lastTimeDrawed , isLoop());
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


	public float getLastTimeDrawed() {
		return lastTimeDrawed;
	}


	public void setLastTimeDrawed(float lastTimeDrawed) {
		this.lastTimeDrawed = lastTimeDrawed;
	}
	
	public Sprite getSpriteToDraw() {
		Sprite temp = getKeySprite();
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
