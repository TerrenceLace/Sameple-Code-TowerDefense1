package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.GL30;
import com.mygdx.game.TowerDefense1;

/**
 * Created by Terrence Lacefield on 4/04/2015.
 */
public class SplashScreen implements Screen{
    TowerDefense1 game;

    Texture splashTexture;
    Sprite splashSprite;
    SpriteBatch batch;

    public SplashScreen(TowerDefense1 game){
       this.game = game;
    }

    @Override
    public void show() {
        //splashTexture = new Texture("splashscreen1.jpg");
        splashTexture = new Texture("data/splashscreen.png");
        splashTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

        splashSprite = new Sprite(splashTexture);
        splashSprite.setColor(1, 1, 1, 0);
        splashSprite.setX(Gdx.graphics.getWidth() / 2 - (splashSprite.getWidth() / 2));
        splashSprite.setY(Gdx.graphics.getHeight() / 2 - (splashSprite.getHeight() / 2));

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        splashSprite.draw(batch);
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

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
