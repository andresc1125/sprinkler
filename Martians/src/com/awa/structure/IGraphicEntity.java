package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public interface IGraphicEntity {

	public boolean isDrawable();
	public boolean isVisible();
	public short getZIndex();
	public void draw(SpriteBatch spriteBatch);
	public Rectangle getBounds();
	public Sprite getSpriteToDraw();
	
	public void setIsDrawable(boolean flag);
	public void setVisibility(boolean visibility);
	public void setZIndex(short zIndex);
	public void setBounds(Rectangle newBounds);
	public void dispose();

}
