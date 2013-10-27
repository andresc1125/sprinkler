package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class InformativeEntity extends TextureRegion implements IGraphicEntity {

	@Override
	public boolean isDrawable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public short getZIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw(SpriteBatch spriteBatch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIsDrawable(boolean flag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisibility(boolean visibility) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZIndex(short zIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBounds(Rectangle newBounds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sprite getSpriteToDraw() {
		// TODO Auto-generated method stub
		return null;
	}

}
