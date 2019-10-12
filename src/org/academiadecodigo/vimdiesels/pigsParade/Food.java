package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Food {

    private Grid grid;
    private GridPosition foodPosition;
    private int randomFood;

    public Food(Grid grid) {
        this.grid = grid;
        this.foodPosition = new Position(grid.getCols()/2, grid.getRows()/2, grid);
        //randomFood = new Position((int) (Math.random() * grid.getCellSize())) ;

    }

    public void createFood(){

        randomFood = (int) (Math.random() * (grid.getCols()*grid.getRows()));

        if(randomFood != grid.getBorderSize()){
            createFood();
        }

        createFood();
    }

    public void checkFoodColision{


    }

}
