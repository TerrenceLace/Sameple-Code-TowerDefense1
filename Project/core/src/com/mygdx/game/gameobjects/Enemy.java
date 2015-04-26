package com.mygdx.game.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 *
 * The enemy class defines the attributes of an enemy.
 *
 * Note: There are currently a limited number of enemy classes defined as gameplay mechanics revolving
 * around enemy stats have not yet been implemented. In the future I will look into alternative ways
 * to organize, store, and retrieve enemy information; especially if the number of different enemies
 * becomes very large.
 *
 * Note: Also note ai will be handled by another class. That class is still a work in progress as
 * I am still familiarizing myself with the LidGDX ai tools, as well as working to wrap my head
 * around some of the move complex, often calculus based ideas
 */
public abstract class Enemy extends KillableObject implements  MovableGameObject{
    protected int damage;
    protected double movementSpeed;
    protected int armor;
    protected Vector2 velocity;
    protected float SPEED;
    protected float rotation;
    protected Vector2 startPoint;
    protected Vector2 endPoint;

    public Enemy(){
        sprite = new Sprite(new Texture("debugNoEnemyTexture.png"));
        SPEED = 3;
        rotation = 0;
        velocity = new Vector2(0, 0);
    }

    @Override
    public void update() {
        /** Moves enemy forward by adding distance to position;
         * distance is found my multiplying the unit vector @velocity by SPEED to get a velocity
         * and then multiplying the velocity by the elapsed time @deltaTime */
        position.add(velocity.cpy().scl(SPEED * Gdx.graphics.getDeltaTime()));
    }

    @Override
    public float getSPEED() {
        return SPEED;
    }

    @Override
    public void setSPEED(float SPEED) { this.SPEED = SPEED;}

    /** Getters and Setters */
    public float getSpeed() {
        return SPEED;
    }

    public void setSpeed(float speed) {
        this.SPEED = speed;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public float getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(float currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Sprite getSprite() { return sprite;}

    public void setSprite(Texture texture) {this.sprite = sprite;}

    public Vector2 getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Vector2 startPoint) {
        this.startPoint = startPoint;
    }

    public Vector2 getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Vector2 endPoint) {
        this.endPoint = endPoint;
    }

}
