package org.academiadecodigo.vimdiesels.pigsParade;


import org.academiadecodigo.vimdiesels.pigsParade.components.GameStage;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Game {

    int delay;
    Snake snake;

    public Game(int delay){
        this.delay = delay;
    }

    public void init(){
        Grid grid = new Grid(41, 21);
        grid.init();

        Grid gameStage = new GameStage(grid.getCols(), grid.getRows()-3);
        gameStage.init();
        System.out.println(gameStage.getCols() + " " + gameStage.getRows());
        snake = new Snake(gameStage);

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