package org.academiadecodigo.vimdiesels.pigsParade.Keyboard;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class KeyboardHandler implements org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler {

    private Rectangle square;

    public KeyboardHandler(Rectangle square) {
        this.square = square;
    }

    @Override
    public void keyPressed(KeyboardEvent event) {

        switch (event.getKey()){

            case KeyboardEvent.KEY_UP:
                case KeyboardEvent.KEY_W:
                this.square.translate(0, -20);
                break;

            case KeyboardEvent.KEY_DOWN:
                case KeyboardEvent.KEY_S:
                this.square.translate(0,20);
                break;

            case KeyboardEvent.KEY_RIGHT:
                case KeyboardEvent.KEY_D:
                this.square.translate(20,0);
                break;

            case KeyboardEvent.KEY_LEFT:
                case KeyboardEvent.KEY_A:
                this.square.translate(-20,0);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
