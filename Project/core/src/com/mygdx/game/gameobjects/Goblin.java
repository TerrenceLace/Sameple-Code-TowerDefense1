package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import java.awt.geom.Path2D;

/**
// * Created by Terrence Lacefield on 4/05/2015.
 */
public class Goblin extends Enemy {

    /** Goblin has the following attributes to set:
     *  position
     *  width;
     *  height;
     *  sprite;
     *
     *  protected double currentHealth;
     *  public boolean isAlive;
     *  public boolean hasTakenDamage;
     *  protected int maxHealth;
     *  protected int damage;
     *  protected double movementSpeed;
     *  protected int armor;
     *  velocity;
     */

    public Goblin(){
        maxHealth = 40;
        currentHealth = maxHealth;
        damage = 2;
        movementSpeed = SPEED = 4;
        armor = 10;
        texture = new Texture("goblin_sprite.png");
        sprite = new Sprite(texture);
        width = 5;
        height = 5;
    }

    public Goblin(Vector2 position) {
        this();
        this.position = position;
    }
}
