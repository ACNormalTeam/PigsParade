package org.academiadecodigo.vimdiesels.pigsparade.gameobjects.types;

import org.academiadecodigo.vimdiesels.pigsparade.gameobjects.GameObject;

public class ExtraScore extends GameObject {

    public int setScorePoints(int scorePoints) {
        return scorePoints * 3;
    }
}
