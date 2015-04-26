package com.mygdx.game.gameobjects.mangers;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.View.Level;
import com.mygdx.game.gameobjects.EnemyHealthBar;
import com.mygdx.game.gameobjects.TowerHealthBar;

import java.util.Iterator;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class HealthBarManager {
    Level level;
    private Array<TowerHealthBar> towerHealthBars = new Array<TowerHealthBar>();
    private Array<EnemyHealthBar> enemyHealthBars = new Array<EnemyHealthBar>();
    private Iterator<TowerHealthBar> towerHealthBarIterator;
    private Iterator<EnemyHealthBar> enemyHealthBarIterator;
    private TowerHealthBar towerHealthBar;
    private EnemyHealthBar enemyHealthBar;
    private SpriteBatch batch;

    public HealthBarManager(Level level){
        this.level = level;
        
    }

    public void update(){
        towerHealthBarIterator = towerHealthBars.iterator();
        enemyHealthBarIterator = enemyHealthBars.iterator();
        while(towerHealthBarIterator.hasNext()){
            towerHealthBar = towerHealthBarIterator.next();
            towerHealthBar.update();
        }
        while(enemyHealthBarIterator.hasNext()){
            enemyHealthBar = enemyHealthBarIterator.next();
            enemyHealthBar.update();
        }
    }

    public void render(){
        batch.begin();;
        towerHealthBarIterator = towerHealthBars.iterator();
        enemyHealthBarIterator = enemyHealthBars.iterator();
        while(towerHealthBarIterator.hasNext()){
            towerHealthBar = towerHealthBarIterator.next();
            towerHealthBar.draw(batch);
        }
        while(enemyHealthBarIterator.hasNext()){
            enemyHealthBar = enemyHealthBarIterator.next();
            enemyHealthBar.draw(batch);
        }
        batch.end();
    }

    public void dispose(){
        while(towerHealthBarIterator.hasNext()){
            towerHealthBar = towerHealthBarIterator.next();
            towerHealthBar.dispose();
        }
        while(enemyHealthBarIterator.hasNext()){
            enemyHealthBar = enemyHealthBarIterator.next();
            enemyHealthBar.dispose();
        }
        batch.dispose();
    }

    public void setLevel(Level  level){
        this.level = level;
    }

}
