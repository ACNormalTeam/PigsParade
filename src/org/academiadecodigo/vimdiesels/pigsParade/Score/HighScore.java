package org.academiadecodigo.vimdiesels.pigsParade.Score;

public class HighScore {

    private int highscore;

    public HighScore() {
        this.highscore = 0;
    }

    public void setHighscore(int scoreToCheck) {

        if(scoreToCheck > this.highscore) {
            this.highscore = scoreToCheck;
        }

    }

}
