package org.academiadecodigo.vimdiesels.pigsparade.gameobjects.types;

public enum GameObjectType {
    FOLLOWER("Follower"),
    SPEED_UP("Speed Up"),
    EXTRA_SCORE("Extra score"),
    KILLER("Killer");

    private String objstr;

    GameObjectType(String objstr) {
        this.objstr = objstr;
    }

    public String getObjstr() {
        return objstr;
    }

}
