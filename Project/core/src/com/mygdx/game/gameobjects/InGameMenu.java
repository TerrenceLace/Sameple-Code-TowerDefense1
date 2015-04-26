package com.mygdx.game.gameobjects;

import com.mygdx.game.View.Level;

import java.util.Vector;

/**
 * Created by Terrence Lacefield on 4/05/2015.
 */
public class InGameMenu {
    Level level;

    private Vector dashboardItems;

    public InGameMenu(Level level){
        this.level = level;

    }

    public void addTextItem(String label, String value, int x, int y)
    {
        //dashboardItems.addElement(new DashboardItem(false, label, value, x, y));
    }
}
