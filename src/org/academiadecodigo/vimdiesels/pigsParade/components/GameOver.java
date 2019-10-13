package org.academiadecodigo.vimdiesels.pigsParade.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class GameOver {

    Rectangle rectangle;
    Grid grid;

    public GameOver(Grid grid){
        this.grid = grid;
        rectangle = new Rectangle(this.grid.getPadding(), this.grid.getPadding(), this.grid.getWidth(), this.grid.getHeight()+this.grid.getPadding());
        rectangle.setColor(Color.RED);

    }

    public void init(){
        rectangle.fill();
    }
}
