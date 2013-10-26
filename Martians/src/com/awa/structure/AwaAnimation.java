package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AwaAnimation extends Animation {

	public AwaAnimation(float frameDuration,Array<? extends TextureRegion> keyFrames) {
		
		super(frameDuration, keyFrames);
		// TODO Auto-generated constructor stub
	}
	
	public TextureRegion getKeyFrame (float stateTime, boolean looping) 
	{
		return super.getKeyFrame(stateTime , looping);
	}

}
