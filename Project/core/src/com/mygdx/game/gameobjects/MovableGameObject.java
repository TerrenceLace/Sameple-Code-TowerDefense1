package com.mygdx.game.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Terrrence Lacefield on 4/05/2015.
 *
 * Defines an object that can move.
 *
 * This interface will likely expand as gameplay mechanics are implemented. As of now, this
 * interface is used to show sibilance between GameObjects that have update methods that
 * change their position.
 */
public interface MovableGameObject {

    /* Getters  and Setters */
    public Vector2 getVelocity();

    public void setVelocity(Vector2 velocity);

    public float getSPEED();

    public void setSPEED(float SPEED);

    public float getRotation();

    public void setRotation(float rotation);
}
