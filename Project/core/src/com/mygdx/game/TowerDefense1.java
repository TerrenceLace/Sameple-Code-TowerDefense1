package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.game.screens.GameScreen;

/**Written by Terrence Lacefield
 * Created 4/01/2015
 *
 *  Welcome, this is my second attempt at creating a Tower Defense Game on the android platform.
 *  This project is very much still a work in progress that started to see how far I could get in
 *  the design and development of a mobile application. The purpose of this project is to gain
 *  experience using the LibGDX engine, gain additional practice in OOP design techniques, as well
 *  as delve into some more complicated things such as pathfinding, pathing behaviors, ai, android
 *  ui's, and dynamic mapping. The goal of this project is to build a single level that contains
 *  enemies with pathing ai, towers with target selection ai, and game logic that allows for the
 *  player to build towers in valid locations and interact with the game through touch inputs.
 *
 *  Credit: Most of these classes are hand written by me, and are likely not perfect. I am not
 *  incredibly experienced in game design and thus the framework for the game unavoidably
 *  influenced by tutorials and open-sourced code as acknowledged below:
 *
 *  youtube: "Creating a Game in Java - Episode 9: Bullets and More Collision Detection":
 *      https://www.youtube.com/watch?v=WP5qA_kgV6Y&list=PL8E5pNjh8OR3f6X4tpjt0M0By6z0sB4MP&index=1
 *  youtube: "Android Game 1 Java Programming tutorial" :
 *      https://www.youtube.com/watch?v=6NBt36fO0iw
 *  code.google: Tower Defense : https://code.google.com/p/icagame/source/browse/TowerDefense..
 *      ../src/phonegame/GameDashboard.java?r=54&spec=svn54
 *
 *    Also credit to the likely hundreds of stack overflow questions and topics that I have
 *    used to even begin to get this game up and running.
 *
 *    And of course to the creators of the LibGDX engine that help make it possible for any novice
 *    to game design and rendering to get experience without having to learn all the really hard
 *    stuff all at once.
 */

public class TowerDefense1 extends Game {
    public static String LOG = "TowerDefense1";

    public TowerDefense1() {
        super();
    }

    @Override
    public void create() {
        //Menu Screen is disable, game jumps directly into main game screen.
        setScreen(new GameScreen(this));

    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void setScreen(Screen screen) {
        super.setScreen(screen);
    }

    @Override
    public Screen getScreen() {
        return super.getScreen();
    }

}
