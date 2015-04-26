package com.mygdx.game.Screens;

import com.badlogic.gdx.Screen;
import com.mygdx.game.TowerDefense1;
import com.mygdx.game.View.Level;
import com.mygdx.game.View.LevelRenderer;

/**
 * Created by Terrence Lacefield on 4/01/2015.
 *
 * This is the main game screen. On this screen we interact with the levelRenderer too render the
 * map and the level object to update and render GameObjects.
 */
public class GameScreen implements Screen {
    TowerDefense1 game;
    Level level;
    LevelRenderer levelRenderer;

    public GameScreen(TowerDefense1 game) {
        this.game = game;
        level = new Level(game);
        levelRenderer = new LevelRenderer(level);

    }

    public void show() {

    }

    @Override
    public void render(float delta) {
        level.update();
        levelRenderer.render();
        level.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {
        level.pause();
    }

    @Override
    public void resume() {
        level.resume();
    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        level.dispose();
        levelRenderer.dispose();
    }
}
