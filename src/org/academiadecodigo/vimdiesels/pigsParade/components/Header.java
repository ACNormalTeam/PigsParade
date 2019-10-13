package org.academiadecodigo.vimdiesels.pigsParade.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Header {

    Grid grid;
    public Rectangle headerWrapper;
    private static int headerHeight;
    private static int heightCells;

    public Header(Grid grid, int heightCells){
    this.grid = grid;
    Header.heightCells = heightCells;
    }

    public void init(){
        headerWrapper = new Rectangle(grid.getPadding(),grid.getPadding(),grid.getWidth(),grid.rowToY(heightCells));
        headerWrapper.setColor(Color.RED);
        headerWrapper.fill();

        headerHeight = headerWrapper.getHeight();
    }

    public Rectangle getShape(){
        return headerWrapper;
    }

    public static int getHeight(){
        return headerHeight;
    }

    public static int getHeightCells(){
        return heightCells;
    }
}
