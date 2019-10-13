package org.academiadecodigo.vimdiesels.pigsParade.food;

public class FoodFactory {

    Food food;

    public FoodFactory(Food food) {
        this.food = food;
    }

    public static Food getNewFood() {

        int random = (int) (Math.random() * FoodType.values().length);
        FoodType foodType = FoodType.values()[random];

        switch (foodType) {

            case APPLE:
                return new Food();

            case STRAWBERRY:
                return new Food();

        }
        return null;
    }
}
