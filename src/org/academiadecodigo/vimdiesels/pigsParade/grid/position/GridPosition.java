package org.academiadecodigo.vimdiesels.pigsParade.grid.position;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;
import org.academiadecodigo.vimdiesels.pigsParade.grid.GridDirection;
import org.w3c.dom.css.Rect;

public interface GridPosition {


    public int getCol();

    public int getRow();

    public GridDirection getDirection();

    public void setPos(int col, int row);

    public void setDirection(GridDirection direction);

    public GridColor getColor();

    public Rectangle getRectangle();

    public void setColor(GridColor color);

    public void show();

    public void hide();

    public void moveInDirection(GridDirection direction, int distance);

    public boolean equals(GridPosition position);

}

