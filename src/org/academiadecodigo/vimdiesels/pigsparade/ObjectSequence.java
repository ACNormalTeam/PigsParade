package org.academiadecodigo.vimdiesels.pigsparade;

import org.academiadecodigo.vimdiesels.pigsparade.grid.DirectionControl;

import static org.academiadecodigo.vimdiesels.pigsparade.grid.DirectionControl.*;

public class ObjectSequence {


    private DirectionControl currentDirection;
    private boolean alive;
    private int x;
    private int y;
    private int speed;

    public ObjectSequence() {

        this.alive = true;
        this.x = 0;
        this.y = 0;
        this.speed = 1;
        this.currentDirection = RIGHT;
        run();
    }

    private void updateValue() {}

    private void show() {}

    private void addFollower() {}

    private void die() {}

    private void run() {

        //translate only needed for the lib graphics, this method it's needed for the game logic only!
        switch (this.currentDirection) {
            case UP:
                this.y -= 1;
                //this.testSquare.translate(0,-1);
            case DOWN:
                this.y += 1;
                //this.testSquare.translate(0,1);
            case LEFT:
                this.x -= 1;
                //this.testSquare.translate(-1,0);
            case RIGHT:
                this.x += 1;
                //this.testSquare.translate(1,0);

            default:
                System.out.println("Something went wrong!");
        }

        if (alive) {
            run();
        }

        //this.testSquare.translate(0,0);

    }

    public void changeDirection(DirectionControl input) {

        switch(input) {
            case UP:
                this.currentDirection = UP;
                break;
            case DOWN:
                this.currentDirection = DOWN;
                break;
            case LEFT:
                this.currentDirection = LEFT;
                break;
            case RIGHT:
                this.currentDirection = RIGHT;
                break;

            default:
                System.out.println("Something went wrong!");

        }
    }
}
