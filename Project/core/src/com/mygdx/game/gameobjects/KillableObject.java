package com.mygdx.game.gameobjects;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 *
 * This class extends GameObject to define a GameObject that can killed, and thus has a current
 * health that can depleted to such a state that it can be considered not alive, and thus no longer
 * needed to be maintained of rendered.
 */
public abstract class KillableObject extends GameObject{
    private final float minLivingHealth = 0.0001f;
    private final int defaultMaxHealth = 100;
    private final int maxHealthPercent = 1;
    protected float currentHealth;
    protected int maxHealth;
    protected boolean isAlive;
    public boolean hasTakenDamage;
    public float currentHealthPercent;

    public KillableObject(){
        maxHealth = defaultMaxHealth;
        currentHealth = maxHealth;
        isAlive = true;
        hasTakenDamage = false;
        currentHealthPercent = maxHealthPercent;
    }

    public boolean isAlive(){
        if(currentHealth < minLivingHealth){isAlive = false;}
        return isAlive;
    }

    public boolean hasTakenDamage(){ return hasTakenDamage;}

    /**Allows an object to take damage or receive healing(with a negative value)*/
    public void updateHealth(float damage){
        currentHealth -= damage;
        updateHealth();
    }

    public void updateHealth(){
        /**Checks to see if a heal update puts an object at full health*/
        if (currentHealth >= maxHealth){
            currentHealth = maxHealth;
            hasTakenDamage = false;
        }
        else if( currentHealth < minLivingHealth) {
            currentHealth = 0;
            isAlive = false;
        }
        else {hasTakenDamage = true;}
        /**Floating point arithmetic slow on android, consider alternative calculation method*/
        if(isAlive){currentHealthPercent = (currentHealth / maxHealth);}
    }

    /**Getters and Setters*/
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

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isHasTakenDamage() {
        return hasTakenDamage;
    }

    public void setHasTakenDamage(boolean hasTakenDamage) {
        this.hasTakenDamage = hasTakenDamage;
    }

    public float getCurrentHealthPercent() {
        return currentHealthPercent;
    }

    public void setCurrentHealthPercent(float targetHealthPercent) {
        currentHealth = targetHealthPercent * maxHealth;
    }
}
