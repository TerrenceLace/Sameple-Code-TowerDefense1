package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class EnemyHealthBar extends GameObject implements MovableGameObject {
    Enemy target;
    float currentHealthPercent;

    protected Vector2 velocity;
    protected float SPEED;
    protected float rotation;

    public EnemyHealthBar(Enemy target){
        //Will have to figure out how to implement an animated health bar, but for now a static sprite will do
        texture = new Texture("enemyHealthBarTexture.png");
        currentHealthPercent = target.getCurrentHealthPercent();
        /*Positions health bar directly over target*/
        position.x = target.position.x;
        position.y = target.position.y + 40;
        width = 50;
        height = 10;

    }

    @Override
    public void update() {
        //Code to update texture to display the current health percentage on the health bar
    }

    @Override
    public Vector2 getVelocity() {
        return null;
    }

    @Override
    public void setVelocity(Vector2 velocity) {

    }

    @Override
    public float getSPEED() {
        return 0;
    }

    @Override
    public void setSPEED(float SPEED) {

    }

    @Override
    public float getRotation() {
        return 0;
    }

    @Override
    public void setRotation(float rotation) {

    }
}
