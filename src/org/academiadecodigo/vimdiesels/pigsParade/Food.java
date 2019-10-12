package org.academiadecodigo.vimdiesels.pigsParade;


import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Food {

    private Grid grid;
    private GridPosition foodPosition;
    private int rowRandomFood;
    private int colRandomFood;


    public Food(Grid grid) {
        this.grid = grid;
        //createFood();
    }

    public void createFood(){

        rowRandomFood = (int) (Math.random() * (
                (grid.getRows() - (grid.getBorderCells() - ((grid.getPadding() * 2)/grid.getCellSize()))) - (Header.getHeightCells() + grid.getBorderCells())
        )) + Header.getHeightCells() + grid.getBorderCells();

        colRandomFood = (int) (Math.random() * (
                (grid.getCols() - grid.getBorderCells()) - (grid.getBorderCells())
        )) + grid.getBorderCells();

        foodPosition = new Position(colRandomFood, rowRandomFood, grid);
    }
}
