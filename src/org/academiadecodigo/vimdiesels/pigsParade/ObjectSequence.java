package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.pigsParade.Grid.DirectionControl;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class ObjectSequence implements KeyboardHandler {

    private GridPosition position;
    private Grid grid;

    private final int MAX_SPEED = 2;
    private Keyboard keyboard;
    private int speed = 0;
    private DirectionControl currentDirection;

    public ObjectSequence(Grid grid){
        this.grid = grid;
        this.position = new Position(grid.getCols()/2, grid.getRows()/2, grid);
<<<<<<< HEAD
        System.out.println(grid.getCols()/2);
        this.position.setPos(2, 1);
=======
        position.setColor(GridColor.RED);
        currentDirection = DirectionControl.values()[(int) (Math.random() * DirectionControl.values().length)];
        keyboard = new Keyboard(this);
        init();
    }

    private void init() {

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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                currentDirection = DirectionControl.LEFT;
                break;
            case KeyboardEvent.KEY_RIGHT:
                currentDirection = DirectionControl.RIGHT;
                break;
            case KeyboardEvent.KEY_UP:
                currentDirection = DirectionControl.UP;
                break;
            case KeyboardEvent.KEY_DOWN:
                currentDirection = DirectionControl.DOWN;
                break;
        }

>>>>>>> e0ecbf24118774706e25d45c6e9e0a8409bab8f7
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

