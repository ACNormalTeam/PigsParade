package org.academiadecodigo.vimdiesels.pigsParade.grid.position;

import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridDirection;

public interface GridPosition {


    public int getCol();

    public int getRow();

    public void setPos(int col, int row);

    public GridColor getColor();

    public void setColor(GridColor color);

    public void show();

    public void hide();

    public void moveInDirection(GridDirection direction, int distance);

    public boolean equals(GridPosition position);

}

