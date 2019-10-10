package org.academiadecodigo.vimdiesels.pigsParade.Sections.components;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class GameStage extends Grid {

    private Rectangle rectangle;

    private int
            cols,
            rows;

    private int
            width,
            height;

    public GameStage(int cols, int rows) {

        this.cols = cols;
        this.rows = rows;

        this.width = cols * CELL_SIZE;
        this.height = (rows-3) * CELL_SIZE;

    }



    @Override
    public void init() {
        //super.init();

        this.rectangle = new Rectangle(PADDING, PADDING+(CELL_SIZE*3), this.width, this.height);
        this.rectangle.setColor(Color.DARK_GRAY);
        this.rectangle.fill();
    }
}
