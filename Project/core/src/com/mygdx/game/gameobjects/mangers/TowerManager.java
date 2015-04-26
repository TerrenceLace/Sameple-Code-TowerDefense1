package com.mygdx.game.gameobjects.mangers;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.View.Level;
import com.mygdx.game.gameobjects.Tower;

import java.util.Iterator;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class TowerManager {
    Level level;
    private Array<Tower> towers = new Array<Tower>();
    private Iterator<Tower> towerIterator;
    private Tower tower;
    private SpriteBatch batch;

    public TowerManager(Level level){
        this.level = level;
    }

    public void update(){
        towerIterator = towers.iterator();
        while(towerIterator.hasNext()){
            tower = towerIterator.next();
            tower.update();
        }
    }

    public void render(){
        towerIterator = towers.iterator();
        while(towerIterator.hasNext()){
            tower = towerIterator.next();
            batch.draw(tower.getTexture(), tower.getPosition().x, tower.getPosition().y, tower.getWidth() / 2, tower.getHeight() / 2, tower.getWidth(), tower.getHeight(), 1, 1, tower.getRotation(), 0, 0, tower.getTexture().getWidth(), tower.getTexture().getHeight(), false, false);
        }
    }

    public void dispose(){
        towerIterator = towers.iterator();
        while(towerIterator.hasNext()){
            tower = towerIterator.next();
            tower.dispose();
        }
    }

    public void setLevel(Level  level){
        this.level = level;
    }

}
