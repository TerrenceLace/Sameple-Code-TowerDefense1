package com.mygdx.game.Gameobjects.mangers;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.View.Level;
import com.mygdx.game.Gameobjects.Enemy;

import java.util.Iterator;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class EnemyManager {
    Level level;
    private Array<Enemy> enemies = new Array<Enemy>();
    private Iterator<Enemy> enemyIterator;
    private Enemy enemy;
    private SpriteBatch batch;

    public EnemyManager(Level level){
        this.level = level;
    }

    public void update(){
        enemyIterator = enemies.iterator();
        while(enemyIterator.hasNext()){
            enemy = enemyIterator.next();
            enemy.update();
        }
    }

    public void render(){
        enemyIterator = enemies.iterator();
        while(enemyIterator.hasNext()){
            enemy = enemyIterator.next();
            batch.draw(enemy.getTexture(), enemy.getPosition().x, enemy.getPosition().y, enemy.getWidth() / 2, enemy.getHeight() / 2, enemy.getWidth(), enemy.getHeight(), 1, 1, enemy.getRotation(), 0, 0, enemy.getTexture().getWidth(), enemy.getTexture().getHeight(), false, false);
        }
    }

    public void dispose(){
        enemyIterator = enemies.iterator();
        while(enemyIterator.hasNext()){
            enemy = enemyIterator.next();
            enemy.dispose();
        }
    }

    public void setLevel(Level  level){
        this.level = level;
    }

}
