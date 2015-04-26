package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class TowerHealthBar extends GameObject {
    Tower target;
    float currentHealthPercent;

    public TowerHealthBar(Tower target){
        //Will have to figure out how to implement an animated health bar, but for now a static sprite will do
        texture = new Texture("towerHealthBarTexture.png");
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
}
