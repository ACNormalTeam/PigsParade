package org.academiadecodigo.vimdiesels.pigsParade.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class StartScreen implements KeyboardHandler {

    Grid grid;
    Rectangle background;

    private Keyboard keyboard;

    public StartScreen(Grid grid){
        this.grid = grid;
        this.keyboard = new Keyboard(this);

    }

    public void init(){
        background = new Rectangle(grid.getPadding(), grid.getPadding(), grid.getWidth(), grid.getHeight()+grid.getPadding());
        background.setColor(Color.CYAN);
        background.fill();

    }

    public void remove(){
        background.delete();
    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE){

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
