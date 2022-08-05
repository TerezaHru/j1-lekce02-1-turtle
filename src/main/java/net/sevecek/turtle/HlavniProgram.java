package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(450);
        zofka.turnRight(270);

        for (int i = 0; i < 10 ; i++) {
            ZofkaKresliKruh(zofka);
            zofka.penUp();
            zofka.move(80);
            zofka.turnRight(90);
        }

    }


    private void ZofkaKresliKruh(Turtle zofka) {
        for (int i = 0; i <= 0; i++) {
        zofka.penDown();
        zofka.setPenColor(Color.RED);
            for (int j = 0; j < 5 ; j++) {
                zofka.move(50);
                zofka.turnRight(90);
            }
            zofka.turnLeft(60);
            zofka.move(50);
            zofka.turnRight(120);
            zofka.move(50);
            zofka.turnRight(30);
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(50);
        }

    }

}
