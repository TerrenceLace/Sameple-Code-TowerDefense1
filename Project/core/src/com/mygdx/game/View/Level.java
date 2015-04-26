package com.mygdx.game.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.TowerDefense1;
import com.mygdx.game.gameobjects.Enemy;
import com.mygdx.game.gameobjects.mangers.EnemyManager;
import com.mygdx.game.gameobjects.Tower;
import com.mygdx.game.gameobjects.mangers.HealthBarManager;
import com.mygdx.game.gameobjects.mangers.TowerManager;
import com.mygdx.game.screens.DefeatedScreen;

import java.util.Iterator;
import java.util.Timer;

/**
 * Created by Terrence Lacefield on 4/02/2015.
 *
 * The level object is a container for all GameObjects on the screen as well as the top level
 * manager for each object on the screen. Level interacts with the EnemyManger, TowerManger, and
 * HealthBarManger to update and render objects present  within the level. The game as has a state
 * attribute that is used to determine how the game should handle start, pause, and quit commands.
 */
public class Level {
    enum State {WAITING, PLAYING, DEFEATED, VICTORIOUS, PAUSED;}

    TowerDefense1 game;
    boolean isStarted;
    int  playerLife;
    int wave;
    State currentState;
    EnemyManager enemyManager;
    TowerManager towerManager;
    HealthBarManager healthBarManager;

    Timer timer;
    LevelRenderer levelrenderer;
    Array<Enemy> enemies = new Array<Enemy>();
    Array<Tower> towers = new Array<Tower>();
    Iterator<Enemy> enemyIterator;
    Iterator<Tower> towerIterator;
    Enemy enemy;
    Tower tower;

    public Level(TowerDefense1 game){
        this.game = game;
        currentState = State.WAITING;
        isStarted = false;
        Gdx.input.setInputProcessor(new InputController(this));

    }

    /**The level starts in waiting mode, with gives the player time before choosing to put to game
     *into the playing state. In the PLAYING state the level creates, updates, and renders game
      objects */
    public void start(){
        currentState = State.PLAYING;
        isStarted = true;
    }

    public void pause(){currentState = State.PAUSED;}

    public void quit(){currentState = State.DEFEATED;}

    public void resume(){currentState = State.PLAYING;}

    public void win(){currentState = State.VICTORIOUS;}


    public void update() {
        /**Once player life is exhausted game ends*/
        if (playerLife <= 0){
            currentState = State.DEFEATED;
            /*Screen is changed to a DefeatedScreen which lets players know they are defeated and
            disposes of the current level */
            game.setScreen(new DefeatedScreen(game));
        }

        /** Makes sure the game is actually in a state that should be updating gameobjects
         * then tells the managers to update */
        if(currentState.equals(State.PLAYING)){
            enemyManager.update();
            towerManager.update();;
            healthBarManager.update();
        }
    }

    public void render(){
        /** Lets managers know they can render*/
        enemyManager.render();
        towerManager.render();;
        healthBarManager.render();
    }

    public void dispose() {
        /** Tells managers to dispose of assets*/
        enemyManager.dispose();
        towerManager.dispose();;
        healthBarManager.dispose();
    }



    public void setRenderer(LevelRenderer levelRenderder){
        this.levelrenderer = levelRenderder;
    }

    public State getState(){return currentState;}

    public boolean isStarted(){return isStarted;}


}
