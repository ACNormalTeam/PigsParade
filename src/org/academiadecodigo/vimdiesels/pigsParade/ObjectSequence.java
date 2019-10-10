package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.GridPosition;
import org.academiadecodigo.vimdiesels.pigsParade.grid.position.Position;

public class ObjectSequence {

    private GridPosition position;
    private Grid grid;

    public ObjectSequence(Grid grid){
        this.grid = grid;
        this.position = new Position(grid.getCols()/2, grid.getRows()/2, grid);
    }

}
