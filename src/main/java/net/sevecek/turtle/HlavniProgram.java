package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);
    }

    private void nakresliPrasatko(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
        zofka.turnLeft(135);
        zofka.move(70.71);
        zofka.turnLeft(90);
        zofka.move(70.71);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(100);
    }

}
