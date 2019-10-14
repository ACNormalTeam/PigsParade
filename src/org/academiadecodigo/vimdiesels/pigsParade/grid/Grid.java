package org.academiadecodigo.vimdiesels.pigsParade.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 10;

    private int cols, rows, width, height;

    private int gameStageBorderSize, gameStageBorderCells;

    private Rectangle rectangle;

    public Grid(int cols, int rows, int gameStageBorderSize) {

        this.cols = cols;
        this.rows = rows;

        this.width = cols * CELL_SIZE;
        this.height = rows * CELL_SIZE;

        this.gameStageBorderCells = gameStageBorderSize;
        this.gameStageBorderSize = gameStageBorderSize * CELL_SIZE;


    }

    public Grid(){
        this(20, 20, 20);
    }
    public void init() {

        this.rectangle = new Rectangle(PADDING, PADDING, this.width, this.height);
        this.rectangle.setColor(Color.WHITE);
        this.rectangle.draw();

    }

    public void buildBorders(){
        Header.getHeight();

        Rectangle borderTop = new Rectangle(
                getX(),
                Header.getHeight(),
                getWidth(),
                getBorderSize()
        );

        borderTop.setColor(Color.BLUE);
        borderTop.fill();

        Rectangle borderBottom = new Rectangle(
                getX(),
                getHeight(),
                getWidth(),
                getBorderSize()
        );

        borderBottom.setColor(Color.YELLOW);
        borderBottom.fill();

        Rectangle borderLeft = new Rectangle(
                getX(),
                Header.getHeight()+borderTop.getHeight(),
                getBorderSize(),
                getHeight()-Header.getHeight()-getBorderSize()
        );

        borderLeft.setColor(Color.CYAN);
        borderLeft.fill();

        Rectangle borderRight = new Rectangle(
                getWidth()+getPadding()-getBorderSize(),
                Header.getHeight()+getBorderSize(),
                getBorderSize(),
                getHeight()-Header.getHeight()-getBorderSize()
        );

        borderRight.setColor(Color.CYAN);
        borderRight.fill();

    }

    public int getCols() {
        return this.cols;

    }

    public int getRows() {
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

    public int getBorderSize(){
        return this.gameStageBorderSize;
    }

    public int getBorderCells(){
        return gameStageBorderCells;
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
