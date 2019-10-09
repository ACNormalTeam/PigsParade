package org.academiadecodigo.vimdiesels.pigsparade.score;

public class ScoreLogic {

    private int baseScore;

    public ScoreLogic(int baseScore) {
        this.baseScore = baseScore;
    }

    public int getBaseScore() {
        return baseScore;
    }

    public void hitScore() {
        this.baseScore += this.baseScore;
    }

}
