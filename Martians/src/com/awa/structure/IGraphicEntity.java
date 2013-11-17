package com.awa.structure;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.awa.structure.IEntity;
import com.awa.structure.adapters.IShape;

public interface IGraphicEntity extends IEntity {

    public boolean isVisible();
    
    public short getZIndex();
    public Vector2 getPosition();
    public float getRotation();
    public float getScaleX();
    public float getScaleY();
    
    public void setVisibility(boolean visibility);
    public void setZIndex(short zIndex);
    public void setPosition(Vector2 position);
    public void setRotation(float rotation);
    public void setScaleX(float scaleX);
    public void setScaleY(float scaleY);
    
    public void draw(SpriteBatch spriteBatch);
    public Sprite getSpriteToDraw();
}
