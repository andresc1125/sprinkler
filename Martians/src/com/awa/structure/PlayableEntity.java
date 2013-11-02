package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class PlayableEntity extends Sprite implements IGraphicEntity{

	private Boolean drawable ;
	private Boolean visible;
	private short zIndex;
	public  Vector2 position;
	public Rectangle bounds;
	
	public PlayableEntity(float x, float y, float width, float height) {
		this.position = new Vector2(x, y);
		this.bounds = new Rectangle(x - width / 2, y - height / 2, width, height);
		this.drawable = true;
		this.visible = true;
	}
	@Override
	public boolean isDrawable() {
		// TODO Auto-generated method stub
		return this.drawable;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return this.visible;
	}

	@Override
	public short getZIndex() {
		// TODO Auto-generated method stub
		return this.zIndex;
	}

	@Override
	public void draw(SpriteBatch spriteBatch) {
		Sprite returnedSprite = getSpriteToDraw();
		returnedSprite.draw(spriteBatch);
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
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
