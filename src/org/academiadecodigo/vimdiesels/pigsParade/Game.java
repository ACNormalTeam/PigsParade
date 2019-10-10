package org.academiadecodigo.vimdiesels.pigsParade;


import org.academiadecodigo.vimdiesels.pigsParade.Sections.components.GameStage;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Game {

    public Game(){

    }

    public void init(){
        Grid grid = new Grid(41, 21);
        grid.init();

        GameStage gameStage = new GameStage(grid.getCols(), grid.getRows());
        gameStage.init();

        ObjectSequence snake = new ObjectSequence(gameStage);

    }

}