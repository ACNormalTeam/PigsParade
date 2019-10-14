package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import org.academiadecodigo.vimdiesels.pigsParade.components.GameOver;
import org.academiadecodigo.vimdiesels.pigsParade.components.Header;

import org.academiadecodigo.vimdiesels.pigsParade.food.Food;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridDirection;

import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Snake implements KeyboardHandler, Iterable<GridPosition> {

    private Grid grid;

    private List<GridPosition> snakeBody;
    private GridPosition snakeHead;

    private Keyboard keyboard;

    private GameOver gameover;

    private GridDirection currentDirection;
    private CollisionDetector collisionDetector;

    private Food food;

    private Sound deathSound;

    public Snake(Grid grid) {
        this.grid = grid;

        currentDirection = GridDirection.RIGHT;
        keyboard = new Keyboard(this);
        gameover = new GameOver(grid);
        deathSound = new Sound("./resources/sounds/pig.wav");
        init();
    }

    private void init() {

        createSnake();

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);

        createFood();
    }

    public void createSnake(){

        snakeBody = new ArrayList();

        snakeHead = new Position(grid.getCols()/2, grid.getRows()/2, grid, "./resources/images/snake-head.png");
        snakeHead.setColor(GridColor.BLUE);
        snakeHead.setDirection(currentDirection);

        snakeBody.add(snakeHead);

        for(int i = 1; i < 3; i++){
            snakeBody.add(new Position(snakeHead.getCol()-i, snakeHead.getRow(), grid, "./resources/images/snake-body.png"));
        }

    }

    public void autoMove(int delay) throws InterruptedException {


        while (true) {

            GridDirection direction = currentDirection;

            Thread.sleep(delay);

            if (foundWall() || foundBodyPart()) {
                gameover.init();
                return;
            }

            if(foundFood()){
                snakeBody.add(
                        new Position(
                                snakeBody.get(snakeBody.size()-1).getCol(),
                                snakeBody.get(snakeBody.size()-1).getRow(),
                                grid,
                                "./resources/images/snake-body.png"
                        )
                );
                Header.setScore(4);
                food.replace();
            }

            for (int i = snakeBody.size()-1; i >= 0; i--) {
                //System.out.println("snake col=" + snakeBody.get(0).getCol());
                if( i == 0 ){
                    snakeBody.get(i).moveInDirection(direction, 1);
                    break;
                }

                snakeBody.get(i).setPos(
                        snakeBody.get(i-1).getCol(),
                        snakeBody.get(i-1).getRow()
                );

                snakeBody.get(i).getRectangle().translate(
                        this.grid.columnToX(snakeBody.get(i).getCol()) - snakeBody.get(i).getRectangle().getX(),
                        this.grid.rowToY(snakeBody.get(i).getRow()) - snakeBody.get(i).getRectangle().getY()
                );

            }

        }
    }

    public boolean foundFood(){
        return (
                food.getPosition().getCol() == snakeBody.get(0).getCol()) &&
                (food.getPosition().getRow() == snakeBody.get(0).getRow()
        );
    }

    public boolean foundWall(){

        GridPosition snakeHeadPosition = snakeBody.get(0);

        return(
                (snakeHeadPosition.getCol() == grid.getCols()-grid.getBorderCells())
                        || (snakeHeadPosition.getCol() == grid.getBorderCells() - 1)
                        || (snakeHeadPosition.getRow() == grid.getBorderCells() + Header.getHeightCells() -1)
                        || (snakeHeadPosition.getRow() == grid.getRows() - grid.getBorderCells()
                        + (grid.getPadding()/grid.getCellSize()))
        );
    }

    public boolean foundBodyPart(){

        for(int i = 1; i < snakeBody.size()-1; i++){

            if((snakeBody.get(i).getCol() == snakeBody.get(0).getCol()) && snakeBody.get(i).getRow() == snakeBody.get(0).getRow()){
                deathSound.play(false);
                return true;
            }
        }
        return false;
    }

    public void createFood(){
            food = new Food(grid);
            food.createFood();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                if(currentDirection == GridDirection.RIGHT){
                    return;
                }
                currentDirection = GridDirection.LEFT;
                break;
            case KeyboardEvent.KEY_RIGHT:
                if(currentDirection == GridDirection.LEFT){
                    return;
                }
                currentDirection = GridDirection.RIGHT;
                break;
            case KeyboardEvent.KEY_UP:
                if(currentDirection == GridDirection.DOWN){
                    return;
                }
                currentDirection = GridDirection.UP;
                break;
            case KeyboardEvent.KEY_DOWN:
                if(currentDirection == GridDirection.UP){
                    return;
                }
                currentDirection = GridDirection.DOWN;
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public Iterator<GridPosition> iterator() {
        return snakeBody.iterator();
    }
}