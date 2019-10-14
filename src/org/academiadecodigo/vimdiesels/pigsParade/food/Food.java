package org.academiadecodigo.vimdiesels.pigsParade.food;

import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Food {

    private Grid grid;
    private GridPosition foodPosition;


    public Food(Grid grid) {
        this.grid = grid;
    }


    public void createFood(){

        foodPosition = new Position(getRandomCol(), getRandomRow(), grid, "./resources/images/apple.png");
    }

    public GridPosition getPosition(){
        return foodPosition;
    }

    private int getRandomRow(){

       return (int) (Math.random() * (
               (grid.getRows() - (grid.getBorderCells() - (grid.getPadding()/grid.getCellSize()))) - (Header.getHeightCells() + grid.getBorderCells())
       )) + Header.getHeightCells() + grid.getBorderCells();

    }

    private int getRandomCol(){
        return (int) (Math.random() * (
                (grid.getCols() - grid.getBorderCells()) - (grid.getBorderCells())
        )) + grid.getBorderCells();
    }

    public void replace(){
        foodPosition.hide();
        foodPosition.setPos(getRandomCol(), getRandomRow());
        //System.out.println("food row: " + foodPosition.getRow());
        //System.out.println("food col " + foodPosition.getCol());

        foodPosition.getRectangle().translate(
                grid.columnToX(foodPosition.getCol()) - foodPosition.getRectangle().getX(),
                grid.rowToY(foodPosition.getRow()) - foodPosition.getRectangle().getY()

        );

        //System.out.println("x: " + foodPosition.getRectangle().getX());
        //System.out.println("y: " + foodPosition.getRectangle().getY());

        foodPosition.show();
    }


}