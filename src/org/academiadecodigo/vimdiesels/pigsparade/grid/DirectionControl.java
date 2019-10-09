package org.academiadecodigo.vimdiesels.pigsparade.grid;

public enum DirectionControl {
    UP,
    DOWN,
    LEFT,
    RIGHT;


    public boolean isOppositeDirection(DirectionControl direction) {
        return direction.equals(oppositeDirection());
    }

    public DirectionControl oppositeDirection() {

        DirectionControl opposite = null;

        switch (this) {
            case UP:
                opposite = DirectionControl.DOWN;
                break;
            case DOWN:
                opposite = DirectionControl.UP;
                break;
            case LEFT:
                opposite = DirectionControl.RIGHT;
                break;
            case RIGHT:
                opposite = DirectionControl.LEFT;
                break;
        }

        return opposite;

    }

}