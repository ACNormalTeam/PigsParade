package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.vimdiesels.pigsParade.grid.GridColor;

public enum FoodType {
    APPLE(GridColor.GREEN),
    STRAWBERRY(GridColor.RED);

    private GridColor color;

    FoodType(GridColor color) {
        this.color = color;
    }

    public GridColor getColor() {
        return this.color;
    }
}
