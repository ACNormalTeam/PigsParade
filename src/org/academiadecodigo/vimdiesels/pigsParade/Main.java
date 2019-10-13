package org.academiadecodigo.vimdiesels.pigsParade;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(10000);
        game.init();
        game.start();

    }
}
