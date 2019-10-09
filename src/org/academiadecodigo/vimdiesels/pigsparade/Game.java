package org.academiadecodigo.vimdiesels.pigsparade;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game {

    private static final int CELL_SIZE = 20;
    private static final double PADDING = 10;
    private Rectangle background;
    private Rectangle square;
    private Keyboard keyboard;
    private KeyboardHandler snakeKeyboardHandler;
    private ObjectSequence snake;
    //GameObject[] objects = new GameObject[20];

    public Game(){

        this.background = new Rectangle(PADDING, PADDING, 800, 800);
        this.square = new Rectangle(PADDING, PADDING, 30, 30);
        this.snake = new ObjectSequence();
        snakeKeyboardHandler = new SnakeKeyboardHandler(this.snake);
        keyboard = new Keyboard(snakeKeyboardHandler);

    }


    public void init(){
        background.setColor(Color.BLACK);
        background.fill();

        square.setColor(Color.PINK);
        square.fill();

        //make it run by default, snakes don't stop XD

        newEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        newEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        newEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        newEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);


    }

    public void newEvent(int key, KeyboardEventType eventType){

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(key);
        event.setKeyboardEventType(eventType);

        keyboard.addEventListener(event);

    }

}
