package org.academiadecodigo.vimdiesels.pigsParade.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Header {

    Grid grid;
    Rectangle headerWrapper;

    public Header(Grid grid){
    this.grid = grid;
    }

    public void init(){
        //System.out.println(grid.getPadding());
        headerWrapper = new Rectangle(grid.getPadding(),grid.getPadding(),grid.getWidth(),grid.rowToY(3));
        headerWrapper.setColor(Color.RED);
        headerWrapper.fill();
    }

    public Rectangle getShape(){
        return headerWrapper;
    }
}
