package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by User on 4/24/2015.
 */
public class ArcherTower extends Tower {

    public ArcherTower() {
        maxHealth = 1000;
        damage = 20;
        attackSpeed = 11;
        armor = 20;
        pentration = 10;
        range = 50;
        width = 10;
        height = 10;
        texture = new Texture("archertower_sprite.png");
        sprite = new Sprite(texture);
    }

    public ArcherTower(Vector2 position) {
        this();
        this.position = position;
    }
}
