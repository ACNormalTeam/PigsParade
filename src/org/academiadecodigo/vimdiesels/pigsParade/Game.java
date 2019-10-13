package org.academiadecodigo.vimdiesels.pigsParade;


//import org.academiadecodigo.vimdiesels.pigsParade.components.GameStage;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.components.StartScreen;
import org.academiadecodigo.vimdiesels.pigsParade.food.Food;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;


public class Game {

    private int delay;
    private Snake snake;
    private Grid grid;



    public Game(int delay){
        this.delay = delay;
    }

    public void init(){

        Grid grid = new Grid(62, 32, 2);
        this.grid = grid;
        this.grid.init();


        Header header = new Header(this.grid, 6);
        header.init();

        this.grid.buildBorders();

        snake = new Snake(this.grid);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


    }


    public void start() throws InterruptedException {
         snake.autoMove(this.delay);
    }

}