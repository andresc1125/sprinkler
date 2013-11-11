	package com.me.mygdxgame;

import com.awa.structure.AwaGestureListener;
import com.awa.structure.World;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.input.GestureDetector;

public class Martians implements ApplicationListener {

	private OrthographicCamera camera;
	private World world;
	private SpriteBatch batch;
	private AwaGestureListener listener;

	@Override
	public void create() {		
		Assets.load();
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		world = new World();
		 listener = new AwaGestureListener(world);
         GestureDetector detector = new GestureDetector(listener);
         Gdx.input.setInputProcessor(detector);
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT); 
		
		batch.begin();
		world.drawWorld(batch);
        batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
