package org.academiadecodigo.vimdiesels.pigsparade.grid.position;


import org.academiadecodigo.vimdiesels.pigsparade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsparade.grid.GridColor;
import org.academiadecodigo.vimdiesels.pigsparade.grid.GridDirection;

public abstract class AbstractGridPosition implements GridPosition {

    private int col;
    private int row;
    private GridColor color;
    private Grid grid;


    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.color = GridColor.NOCOLOR;
    }

    public Grid getGrid() {
        return grid;
    }


    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        show();
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public GridColor getColor() {
        return color;
    }

    @Override
    public void setColor(GridColor color) {
        this.color = color;
        show();
    }

    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        switch (direction) {

            case UP:
                moveUp(distance);
                break;
            case DOWN:
                moveDown(distance);
                break;
            case LEFT:
                moveLeft(distance);
                break;
            case RIGHT:
                moveRight(distance);
                break;
        }

    }

    @Override
    public boolean equals(GridPosition pos) {
        return this.col == pos.getCol() && this.row == pos.getRow();
    }

    public void moveUp(int dist) {

        int maxRowsUp = dist < getRow() ? dist : getRow();
        setPos(getCol(), getRow() - maxRowsUp);

    }

    public void moveDown(int dist) {

        int maxRowsDown = dist > getGrid().getRows() - (getRow() + 1) ? getGrid().getRows() - (getRow() + 1) : dist;
        setPos(getCol(), getRow() + maxRowsDown);

    }

    public void moveLeft(int dist) {

        int maxRowsLeft = dist < getCol() ? dist : getCol();
        setPos(getCol() - maxRowsLeft, getRow());

    }


    public void moveRight(int dist) {
        int maxRowsRight = dist > getGrid().getCols() - (getCol() + 1) ? getGrid().getCols() - (getCol() + 1) : dist;
        setPos(getCol() + maxRowsRight, getRow());
    }

    @Override
    public String toString() {
        return "GridPosition{" +
                "col=" + col +
                ", row=" + row +
                ", getColor=" + color +
                '}';
    }

}