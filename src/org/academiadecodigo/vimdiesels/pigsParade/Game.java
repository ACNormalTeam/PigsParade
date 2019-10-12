package org.academiadecodigo.vimdiesels.pigsParade;


//import org.academiadecodigo.vimdiesels.pigsParade.components.GameStage;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.components.Header;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;
import org.w3c.dom.css.Rect;


public class Game {

    int delay;
    Snake snake;


    public Game(int delay){
        this.delay = delay;
    }

    public void init(){

        Grid grid = new Grid(82, 42, 3);
        grid.init();

        //this.borderSize = grid.getCellSize();

        Header header = new Header(grid, 3);
        header.init();

        grid.buildBorders();


        snake = new Snake(grid);

    }

    public void start() throws InterruptedException {

        while (true) {
            // Pause for a while
            Thread.sleep(delay);

            autoMoveSnake();

        }

    }

    public void autoMoveSnake() {

        snake.autoMove();

    }

}