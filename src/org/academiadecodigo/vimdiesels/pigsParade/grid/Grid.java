package org.academiadecodigo.vimdiesels.pigsParade.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private int cols, rows, width, height;

    private Rectangle rectangle;

    public Grid(int cols, int rows) {

        this.cols = cols;
        this.rows = rows;

        this.width = cols * CELL_SIZE;
        this.height = rows * CELL_SIZE;

    }

    public Grid(){
        this(20, 20);
    }
    public void init() {

        this.rectangle = new Rectangle(PADDING, PADDING, this.width, this.height);
        this.rectangle.setColor(Color.WHITE);
        this.rectangle.draw();

    }

    public int getCols() {
        //System.out.println(this.cols);
        //System.out.println("this.cols/2 " +this.cols/2);
        return this.cols;

    }

    public int getRows() {
        //System.out.println(this.rows);
        //System.out.println("this.rows/2 " +this.rows/2);
        return this.rows;

    }

    public int getWidth() {

        return this.rectangle.getWidth();

    }

    public int getHeight() {

        return this.rectangle.getHeight();

    }

    public int getX() {

        return this.rectangle.getX();

    }

    public int getY() {

        return this.rectangle.getY();

    }

    public int getPadding(){
        return PADDING;
    }

    public int getCellSize() {
        return CELL_SIZE;
    }

    public GridPosition makeGridPosition() {

        return new Position( this );

    }

    public GridPosition makeGridPosition(int col, int row) {

        return new Position(col, row, this);

    }

    public int rowToY(int row) {
        return ( row * CELL_SIZE ) + PADDING;
    }

    public int columnToX(int column) {
        return ( column * CELL_SIZE ) + PADDING;
    }
}
