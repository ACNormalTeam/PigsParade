package org.academiadecodigo.vimdiesels.pigsParade;


import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class Game {

    public Game(){

    }

    public void init(){
        Grid grid = new Grid(40, 20);
        grid.init();
    }

}
