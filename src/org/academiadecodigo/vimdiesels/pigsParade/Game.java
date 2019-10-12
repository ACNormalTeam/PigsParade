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

    int borderSize;

    public Game(int delay){
        this.delay = delay;
        this.borderSize = 10;
    }

    public void init(){

        Grid grid = new Grid(41, 21);
        grid.init();

        Header header = new Header(grid);
        header.init();

        Rectangle borderTop = new Rectangle(header.getShape().getX(), header.getShape().getHeight(), header.getShape().getWidth(), borderSize);
        borderTop.setColor(Color.BLUE);
        borderTop.fill();

        Rectangle borderBottom = new Rectangle(grid.getX(), grid.getHeight(), grid.getWidth(), borderSize);
        borderBottom.setColor(Color.BLUE);
        borderBottom.fill();

        Rectangle borderLeft = new Rectangle(grid.getX(), header.getShape().getHeight()+borderTop.getHeight(), borderSize, grid.getHeight()-header.getShape().getHeight()-borderBottom.getHeight());
        borderLeft.setColor(Color.CYAN);
        borderLeft.fill();

        Rectangle borderRight = new Rectangle(grid.getWidth(), header.getShape().getHeight()+borderTop.getHeight(), borderSize, grid.getHeight()-header.getShape().getHeight()-borderBottom.getHeight());
        borderRight.setColor(Color.CYAN);
        borderRight.fill();

        snake = new Snake(grid, 10);

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