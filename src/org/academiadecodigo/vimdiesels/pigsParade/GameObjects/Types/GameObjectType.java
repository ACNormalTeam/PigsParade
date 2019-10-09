package org.academiadecodigo.vimdiesels.pigsParade.GameObjects.Types;

public enum GameObjectType {
    FOLLOWER("Follower"),
    SPEED_UP("Speed Up"),
    EXTRA_SCORE("Extra Score"),
    KILLER("Killer");

    private String objstr;

    GameObjectType(String objstr) {
        this.objstr = objstr;
    }

    public String getObjstr() {
        return objstr;
    }

}
