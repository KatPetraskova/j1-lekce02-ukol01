package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        // instance zofky
        zofka = new Turtle();

        // zofka se posune vlevo, aby mela misto na kresleni :)
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.setPenWidth(5);

        // zofka nakresli prasatko
        //nakresliPrasatko(zofka);

        // zofka nakresli 8uhelnik
        nakresliOsmiuhelnik(zofka);

        // zofka se posune vpravo
        zofkaSePosuneVpravo(zofka);

        // zofka nakreslni kolecko
        nakresliKolecko(zofka);

        // zofka se posune vpravo
        zofkaSePosuneVpravo(zofka);

        // zofka nakresli slunicko
        nakresliSlunicko(zofka);


    }

    // metoda pro posun zofky vpravo
    private void zofkaSePosuneVpravo(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    // metoda pro nakresleni slunicka
    private void nakresliSlunicko(Turtle zofka) {
        for (int l = 0; l < 9; l++) {
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.move(30);
            zofka.turnLeft(70);
            zofka.move(15);
            zofka.turnRight(20);
            zofka.move(15);
        }
    }


    // metoda pro nakresleni kolecka
    private void nakresliKolecko(Turtle zofka) {
        for (int k = 0; k < 18; k++) {
            zofka.turnRight(20);
            zofka.move(20);
        }
    }

    // metoda pro nakresleni osmiuhelniku
    private void nakresliOsmiuhelnik(Turtle zofka) {
        for (int j = 0; j < 8; j++) {
            zofka.turnRight(45);
            zofka.move(30);
        }
    }

    // metoda pro nakresleni prasatka
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
