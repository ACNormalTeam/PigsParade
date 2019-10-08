package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.vimdiesels.pigsParade.Grid.DirectionControl;

public class SnakeKeyboardHandler implements org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler {

    private ObjectSequence object;

    public SnakeKeyboardHandler(ObjectSequence object) {
        this.object = object;
    }

    @Override
    public void keyPressed(KeyboardEvent event) {

        switch (event.getKey()){

            case KeyboardEvent.KEY_UP:
                this.object.changeDirection(DirectionControl.UP);
                break;

            case KeyboardEvent.KEY_DOWN:
                this.object.changeDirection(DirectionControl.DOWN);
                break;

            case KeyboardEvent.KEY_RIGHT:
                this.object.changeDirection(DirectionControl.RIGHT);
                break;

            case KeyboardEvent.KEY_LEFT:
                this.object.changeDirection(DirectionControl.LEFT);
               break;

           default:
               System.out.println("Something went wrong!");

        }
    }

    @Override
    public void keyReleased(KeyboardEvent event) {
    }

}
