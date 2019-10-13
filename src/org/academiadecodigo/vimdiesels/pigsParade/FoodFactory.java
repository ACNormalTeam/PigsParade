package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.vimdiesels.pigsParade.grid.Grid;

public class FoodFactory {

    public static Food getNewFood(Grid grid) {

        int random = (int) (Math.random() * FoodType.values().length);
        FoodType foodType = FoodType.values()[random];
        /*
        switch (foodType) {
            case APPLE:
                return
        }*/
        return null;
    }
}
