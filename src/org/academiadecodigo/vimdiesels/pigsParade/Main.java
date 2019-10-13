package org.academiadecodigo.vimdiesels.pigsParade;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(1000);
        Picture p = new Picture(90, 90, "resources/images/floor-720x360.png");
        p.draw();
        Picture j = new Picture(80, 10, "resources/images/floor-720x360.png");
        j.draw();
        Picture h = new Picture(10, 10, "resources/images/floor-720x360.png");
        h.draw();
        game.init();
        game.start();

    }
}
