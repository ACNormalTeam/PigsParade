package org.academiadecodigo.vimdiesels.pigsParade.GameObjects;

import org.academiadecodigo.vimdiesels.pigsParade.GameObjects.Types.*;

public class GameObjectFactory {

    public static GameObject getNewObject(GameObjectType type) {

        switch (type) {
            case FOLLOWER:
                return new Follower();
            case SPEED_UP:
                return new SpeedUp();
            case EXTRA_SCORE:
                return new ExtraScore();
            case KILLER:
                return new Killer();

            default:
                System.out.println("Something went wrong!");
                return null;
        }

    }

}
