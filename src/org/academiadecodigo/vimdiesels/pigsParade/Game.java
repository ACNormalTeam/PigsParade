package org.academiadecodigo.vimdiesels.pigsParade;


import org.academiadecodigo.vimdiesels.pigsParade.Sections.components.GameStage;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Game {

    int delay;
    ObjectSequence snake;

    public Game(int delay){
        this.delay = delay;
    }

    public void init(){
        Grid grid = new Grid(41, 21);
        grid.init();

        GameStage gameStage = new GameStage(grid.getCols(), grid.getRows());
        gameStage.init();

        snake = new ObjectSequence(gameStage);

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