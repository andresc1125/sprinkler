package com.awa.structure;

import java.util.ArrayList;
import com.awa.structure.IEntity;
import java.util.Iterator;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.me.mygdxgame.Assets;

public class World implements IEntity  {
	
	public final ArrayList<IGraphicEntity> entities;
	private ArrayList<AwaAnimation> narutoAnims;
	private AwaAnimation narutoRunning;
	private AnimatedEntity naruto;
	private AnimatedEntity naruto1;
	private AnimatedEntity naruto2;
	private AnimatedEntity naruto3;
	
	
	public World() {
		narutoAnims = new ArrayList<AwaAnimation>();
		entities = new ArrayList<IGraphicEntity>();
		narutoRunning =  new AwaAnimation(0.025f, Assets.narutoRun);
		narutoRunning.setLoop(true);
		narutoRunning.play();
		narutoAnims.add(narutoRunning);
		naruto = new AnimatedEntity(150,150, 30, 30, narutoAnims);
		naruto1 = new AnimatedEntity(10,10, 30, 30, narutoAnims);
		naruto2 = new AnimatedEntity(50,50, 30, 30, narutoAnims);
		naruto3 = new AnimatedEntity(250,250, 30, 30, narutoAnims);

		entities.add(naruto);
		entities.add(naruto1);
		entities.add(naruto2);
		entities.add(naruto3);
	}

	public void drawWorld(SpriteBatch spriteBatch){
		for (Iterator iterator = this.entities.iterator(); iterator.hasNext();) {
			IGraphicEntity entity = (IGraphicEntity) iterator.next();
			if(entity.isVisible()){
				entity.draw(spriteBatch);
			}
		}
	//	narutoRunning.getKeySprite(0.4f, false).draw(spriteBatch);
//		texture = new Texture(Gdx.files.internal("data/help.png"));
//		spriteBatch.draw(texture,0,0,50,50);
	}
	
	
	public void removeEntity(IGraphicEntity entity){
		entities.remove(entity);
		//	entity.dispose();
	}
	
	
	public void addEntity(IGraphicEntity entity){
		entities.add(entity);
	}
	
	
	public ArrayList<IGraphicEntity> getEntities(){
		return this.entities;
	}
}
