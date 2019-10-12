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
<<<<<<< HEAD
    private int i;

    public Food(Grid grid) {
        this.grid = grid;
        createFood();

        while(i < 1){
            createFood();
            i++;
        }

=======


    public Food(Grid grid) {
        this.grid = grid;
        //createFood();
>>>>>>> a22d88c210143c50cc6fa2ced3ac5928a4a37aa0
    }

    public void createFood(){

        rowRandomFood = (int) (Math.random() * (
                (grid.getRows() - (grid.getBorderCells() - ((grid.getPadding() * 2)/grid.getCellSize()))) - (Header.getHeightCells() + grid.getBorderCells())
<<<<<<< HEAD
                )) + Header.getHeightCells() + grid.getBorderCells();

        colRandomFood = (int) (Math.random() * (
                (grid.getCols() - grid.getBorderCells()) - (grid.getBorderCells())
                )) + grid.getBorderCells();

        foodPosition = new Position(colRandomFood, rowRandomFood, grid);
    }

    public void checkFoodColision(){



    }

}
=======
        )) + Header.getHeightCells() + grid.getBorderCells();

        colRandomFood = (int) (Math.random() * (
                (grid.getCols() - grid.getBorderCells()) - (grid.getBorderCells())
        )) + grid.getBorderCells();

        foodPosition = new Position(colRandomFood, rowRandomFood, grid);
    }
}
>>>>>>> a22d88c210143c50cc6fa2ced3ac5928a4a37aa0
