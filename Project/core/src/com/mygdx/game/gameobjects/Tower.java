package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 *
 * The enemy class defines the attributes of an enemy.
 *
 * Note: There are currently a limited number of tower classes defined as gameplay mechanics revolving
 * around tower stats have not yet been implemented. In the future I will look into alternative ways
 * to organize, store, and retrieve tower information; especially if the number of different towers
 * becomes very large.
 */
public abstract class Tower extends KillableObject {
    public Texture texture;
    public float rotation;
    protected double damage;
    protected double attackSpeed;
    protected double armor;
    protected double pentration;
    protected int range;

    public Tower(){
        rotation = 0;
        texture = new Texture("debugNoTowerTexture.png");
    }

    @Override
    public void update() {
        //Code to update tower; targeting, maintaining rate of fire

    }

    /** Getters and Setters */
    public float getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(float currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isHasTakenDamage() {
        return hasTakenDamage;
    }

    public void setHasTakenDamage(boolean hasTakenDamage) {
        this.hasTakenDamage = hasTakenDamage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getPentration() {
        return pentration;
    }

    public void setPentration(double pentration) {
        this.pentration = pentration;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(int range) {
        this.rotation = rotation;
    }

    public Texture getTexture() {return texture;}

    public void setTexture(Texture texture) {this.texture = texture;}
}
