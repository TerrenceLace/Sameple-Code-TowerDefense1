package com.mygdx.game.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.TowerDefense1;
import com.mygdx.game.gameobjects.Enemy;
import com.mygdx.game.gameobjects.Tower;

import java.util.Iterator;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class LevelRenderer {
    Level level;
    float width;
    float height;
    SpriteBatch batch;
    OrthographicCamera camera;
    TextButton.TextButtonStyle style;
    Array<Enemy> enemies = new Array<Enemy>();
    Array<Tower> towers = new Array<Tower>();
    Iterator<Enemy> enemyIterator;
    Iterator<Tower> towerIterator;
    Texture backTexture;
    Stage stage;
    TextButton button;
    TextButton.TextButtonStyle textButtonStyle;
    BitmapFont font;
    Skin skin;
    TextureAtlas buttonAtlas;
    Sprite square;
    TiledMap tiledMap;
    TiledMapRenderer tiledMapRenderer;


    public LevelRenderer(Level level){
        this.level = level;
        level.setRenderer(this);
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        batch = new SpriteBatch();
        backTexture = new Texture("gridlevel1.png");
        square = new Sprite(new Texture("gridsquare.png"));
        //tiledMap = new TmxMapLoader().load("level1.tmx");
        //tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);*/
        //stageSetup();
    }


    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        int squaresOnWidth = 14;
        int squaresOnHeight = 8;
        float squareWidth = camera.viewportWidth / squaresOnWidth;
        float squareHeight = camera.viewportHeight / squaresOnHeight;
        square.setSize(squareWidth, squareHeight);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        //batch.draw(backTexture, 0, 0);
        /**Comments lines are part of the tiled map implementation that is still being written.
         * Commented code does not compile but is left here for transparency as well tas o show where
         * this code will eventually be in the source code. This is my first experience
         * with using tiled maps so until I can get this working, this renderer simply prints
         * a grid to the screen. */
        for(int y = 0; y < squaresOnHeight; y++) {
            for (int x = 0; x < squaresOnWidth; x++) {
                square.setX(x * squareWidth);
                square.setY(y * squareHeight);
                square.draw(batch);
            }
        }
        //tiledMapRenderer.setView(camera);
        //tiledMapRenderer.render();*/
         batch.end();

        /*float buttonWidth = camera.viewportWidth / 10;
        float buttonHeight = camera.viewportHeight / 10;
        for(int y = 0; y < 10; y++){
            for(int x = 0; x < 10; x++){
                Actor button = stage.getActors().get(x + y * 10);
                //TextButton button = stage.ge
                button.setX(x * buttonWidth);
                button.setY(y * buttonHeight);
                button.setWidth(buttonWidth);
                button.setHeight(buttonHeight);
            }
        }*/
       //Stage.act(Gdx.graphics.getDeltaTime());
       //stage.draw();
    }

    public void dispose() {
       backTexture.dispose();
       batch.dispose();
    }

    /** This method is commented here as the goal of the work and experimenting is for the goal
    or creating a tiled map made of buttons. These buttons will respond to touch inputs and
    will allow the user to interact with the map by selecting on a square within the grid
     */
   /* public void stageSetup(){
        stage = new Stage();
       // Gdx.input.setInputProcessor(stage);
        font = new BitmapFont();
        skin = new Skin();
        //buttonAtlas = new TextureAtlas(Gdx.files.internal("buttons/buttons.pack"));
        //skin.addRegions(buttonAtlas);
        textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("gridsquare");
        textButtonStyle.down = skin.getDrawable("gridsquare");
        textButtonStyle.checked = skin.getDrawable("gridsquare");
        button = new TextButton("Button1", textButtonStyle);
        stage.addActor(button);

        /*for(int y = 0; y < 10; y++){
            for(int x = 0; x < 10; x++){
                //stage.addActor(new TextButton("" + x + y * 10, new TextButton.TextButtonStyle()));
                stage.addActor(new TextButton("" + x + y, textButtonStyle));
            }
        }
    }*/
}
