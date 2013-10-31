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
	private Texture texture;
	private ArrayList<AwaAnimation> narutoAnims;
	private AwaAnimation narutoRunning;
	private AnimatedEntity naruto;
	
	public World() {
		Assets.load();
		narutoAnims = new ArrayList<AwaAnimation>();
		entities = new ArrayList<IGraphicEntity>();
		narutoRunning =  new AwaAnimation(0.5f, Assets.narutoRun);
		narutoRunning.play();
		narutoAnims.add(narutoRunning);
		naruto = new AnimatedEntity(30, 30, 30, 30, narutoAnims);
		entities.add(naruto);
	}

	public void drawWorld(SpriteBatch spriteBatch){
		for (Iterator iterator = this.entities.iterator(); iterator.hasNext();) {
			IGraphicEntity entity = (IGraphicEntity) iterator.next();
			if(entity.isDrawable()){
				entity.draw(spriteBatch);
			}
		}
		
	//	narutoRunning.getKeySprite(0.4f, false).draw(spriteBatch);
		
		texture = new Texture(Gdx.files.internal("data/help.png"));
		spriteBatch.draw(texture,0,0,50,50);
	}
}
