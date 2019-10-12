package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridDirection;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class Snake implements KeyboardHandler {

    private GridPosition position;
    private Grid grid;

    private Keyboard keyboard;

    private GridDirection currentDirection;

    private int topLimit;

    public Snake(Grid grid, int topLimit) {
        this.grid = grid;
        this.position = new Position(5, 10, grid);


        //position.setColor(GridColor.RED);
        currentDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];
        keyboard = new Keyboard(this);
        init();
    }

    private void init() {
        //position.moveInDirection(GridDirection.LEFT, 2);
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

    }

    public void autoMove() {


        GridDirection direction = GridDirection.RIGHT;

        this.position.moveInDirection(direction, 1);

    }

    public void checkLimits(){

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                currentDirection = GridDirection.LEFT;
                break;
            case KeyboardEvent.KEY_RIGHT:
                currentDirection = GridDirection.RIGHT;
                break;
            case KeyboardEvent.KEY_UP:
                currentDirection = GridDirection.UP;
                break;
            case KeyboardEvent.KEY_DOWN:
                currentDirection = GridDirection.DOWN;
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}