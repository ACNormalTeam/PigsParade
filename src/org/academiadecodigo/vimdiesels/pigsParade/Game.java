package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Game {

    private int delay;
    private Snake snake;
    private Grid grid;
    private Picture bg;
    private Rectangle rectangle;
    private Picture img;
    private int countDown;

    public Game(int delay){
        this.delay = delay;
    }

    public void preInit() throws InterruptedException {

        setGrid();
        rectangle = new Rectangle(grid.getPadding(), grid.getPadding(), grid.getWidth(), grid.getHeight());
        rectangle.setColor(Color.WHITE);
        rectangle.fill();
        img = new Picture(grid.getPadding(), grid.getPadding(), "resources/images/splashscreen.jpg");

        img.draw();


        System.out.println(grid.getWidth() + " x " + grid.getHeight());
        while(countDown < 10){
            Thread.sleep(500);
            countDown++;
        }

        rectangle.delete();
        img.delete();
        init();
    }

    public void init() throws InterruptedException {

        Header header = new Header(this.grid, 6);
        header.init();

        this.grid.buildBorders();

        snake = new Snake(this.grid);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        start();
    }

    public void start() throws InterruptedException {
        snake.autoMove(this.delay);
    }

    public void setGrid(){
        Grid grid = new Grid(62, 32, 2);
        this.grid = grid;
        this.grid.init();

        bg = new Picture(grid.getPadding(), grid.getPadding(), "resources/images/bg-soft.jpg");
        bg.draw();

    }
}