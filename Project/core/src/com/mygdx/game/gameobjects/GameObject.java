package com.mygdx.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public abstract class GameObject implements Drawable, UpdatableObject{
    protected Vector2 position;
    protected float width;
    protected float height;
    protected Rectangle hitbox;
    protected float xOrgin;
    protected float yOrgin;
    protected Texture texture;
    protected Sprite sprite;

    public GameObject(){
        position = new Vector2(0,0);
        width = 10;
        height = 10;
        hitbox = new Rectangle(0, 0, width, height);
        xOrgin = width/2;
        yOrgin = height/2;
        texture = new Texture("debugNoTexture");
    }

    public GameObject(Vector2 position, float width, float height){
        this.position = position;
        this.width = width;
        this.height = height;
        hitbox = new Rectangle(position.x, position.y, width, height);
    }

    @Override
    public void draw(Batch batch, float x, float y, float width, float height) {
        updatePosition(x, y, width, height);
        batch.draw(texture, x, y, width,height);
    }

    public void draw(Batch batch, float x, float y, float width, float height, float rotation) {
        updatePosition(x, y, width, height);
        batch.draw(texture, x, y, width / 2, height / 2, width, height, 1, 1, rotation, 0, 0,texture.getWidth(), texture.getHeight(), false, false);
    }

    public void dispose() {
        texture.dispose();
    }

    public void updatePosition(float x, float y, float width, float height) {
        this.position.x = x;
        this.position.y = y;
        this.width = width;
        this.height = height;
        Vector2 newPosition = new Vector2(x, y);
        hitbox.setPosition(newPosition);
        hitbox.setSize(width, height);
    }

    /** Getters and Setters*/
    public Vector2 getPosition() {return position;}

    public void setPosition(Vector2 position) {this.position = position;}

    public Float getWidth() {return width;}

    public void setWidth(Float width) {this.width = width;}

    public Float getHeight() {return height;}

    public void setHeight(Float height) {this.height = height;}

    public Rectangle getHitbox() {return hitbox;}

    public void setHitbox(Rectangle hitbox) {this.hitbox = hitbox;}

    public Texture getTexture() {return texture;}

    public void setTexture(Texture texture) {this.texture = texture;}

    public Sprite getSpirit() {return sprite;}

    public void setSprite(Texture texture) {this.sprite = sprite;}

    public void draw(Batch batch){
        this.draw(batch, position.x, position.y, width, height);
    }

    @Override
    public float getLeftWidth() {
        return 0;
    }

    @Override
    public void setLeftWidth(float leftWidth) {

    }

    @Override
    public float getRightWidth() {
        return 0;
    }

    @Override
    public void setRightWidth(float rightWidth) {

    }

    @Override
    public float getTopHeight() {
        return 0;
    }

    @Override
    public void setTopHeight(float topHeight) {

    }

    @Override
    public float getBottomHeight() {
        return 0;
    }

    @Override
    public void setBottomHeight(float bottomHeight) {

    }

    @Override
    public float getMinWidth() {
        return 0;
    }

    @Override
    public void setMinWidth(float minWidth) {

    }

    @Override
    public float getMinHeight() {
        return 0;
    }

    @Override
    public void setMinHeight(float minHeight) {

    }
}
