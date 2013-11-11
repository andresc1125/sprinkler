package com.awa.structure;

import com.awa.structure.adapters.IShape;
import com.awa.structure.adapters.Rectangle2;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class PlayableEntity implements  IGraphicEntity, IMoldableEntity, ISoundableEntity   {

	private Boolean visible;
	private short zIndex;
	private Vector2 position;
	private IShape bounds;
	private float rotation;
    private float scaleX = 1, scaleY = 1;
	
		
	public PlayableEntity(float x, float y, float width, float height) {
		this.position = new Vector2(x, y);
		this.bounds = new Rectangle2(x - width / 2, y - height / 2, width, height);
		this.visible = true;
	}


	public void draw(SpriteBatch spriteBatch) {
		Sprite returnedSprite = getSpriteToDraw();
		returnedSprite.draw(spriteBatch);
	}


	@Override
	public IShape getShape() {
		// TODO Auto-generated method stub
		return this.bounds;
	}


	@Override
	public void setShape(IShape shape) {
		this.bounds = shape;
		
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
	public Vector2 getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}


	@Override
	public float getRotation() {
		// TODO Auto-generated method stub
		return this.rotation;
	}


	@Override
	public float getScaleX() {
		// TODO Auto-generated method stub
		return this.scaleX;
	}


	@Override
	public float getScaleY() {
		// TODO Auto-generated method stub
		return this.scaleY;
	}


	@Override
	public void setVisibility(boolean visibility) {
		this.visible = visibility;
		
	}


	@Override
	public void setZIndex(short zIndex) {
		this.zIndex = zIndex;
		
	}


	@Override
	public void setPosition(Vector2 position) {
		this.position = position;
		
	}


	@Override
	public void setRotation(float rotation) {
		this.rotation = rotation;
		
	}


	@Override
	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
		
	}


	@Override
	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
		
	}


	@Override
	public Sprite getSpriteToDraw() {
		// TODO Auto-generated method stub
		return null;
	}

}

