package com.awa.structure;

import java.util.ArrayList;
import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.me.mygdxgame.Assets;

public class World {
	
	public final ArrayList<IGraphicEntity> entities;
	public  ArrayList<Animation> coins;
	private Entity entity;
	private Sprite sprite;
	private Texture texture;
	
	public World() {
		Assets.load();
		coins = new ArrayList<Animation>();
		for(int i = 1;i<=30;i++)
		{
			coins.add(Assets.coinAnim);
			coins.get(i-1);
		}
		
		texture = new Texture(Gdx.files.internal("data/help.png"));
		sprite = new Sprite(texture);
		entity = new Entity(20, 20, 40, 40, this.sprite);
		this.entities =  new ArrayList<Entity>(); 
		this.entities.add(entity);
	}

	public void drawWorld(SpriteBatch spriteBatch){
		for (Iterator iterator = this.entities.iterator(); iterator.hasNext();) {
			Entity entity = (Entity) iterator.next();
			if(entity.isDrawable()){
				
				entity.drawEntity(spriteBatch);
			}
		}
	}
}
