package org.academiadecodigo.vimdiesels.pigsParade.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;

public class Header {

    Grid grid;
    public Rectangle headerWrapper;
    private static int headerHeight;
    private static int heightCells;

    private static int scoreCounter;
    private static Text score;


    public Header(Grid grid, int heightCells){
    this.grid = grid;
    Header.heightCells = heightCells;
    }

    public void init(){
        headerWrapper = new Rectangle(grid.getPadding(),grid.getPadding(),grid.getWidth(),grid.rowToY(heightCells));
        headerWrapper.setColor(Color.RED);
        headerWrapper.fill();

        headerHeight = headerWrapper.getHeight();

        score = new Text(grid.getWidth()-grid.getBorderSize()-grid.getPadding(), Header.getHeight()/2, "0000");

        score.setColor(Color.WHITE);
        score.draw();


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

    public static void setScore(int s){
        scoreCounter += s;
        score.setText( String.format("%04d", scoreCounter));
    }

    public static int getScore(){
        return scoreCounter;
    }

}
