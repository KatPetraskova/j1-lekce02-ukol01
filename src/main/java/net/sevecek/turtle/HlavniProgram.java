package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        // instance zofky
        zofka = new Turtle();

        // zofka se posune vlevo a nahoru, aby mela misto na kresleni :)
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
        zofka.setPenWidth(5);

        // zofka nakresli prasatko
        //nakresliPrasatko(zofka);

        // zofka nakresli 8uhelnik
        //nakresliOsmiuhelnik(zofka);

        // zofka se posune vpravo
        //zofkaSePosuneVpravo(zofka);

        // zofka nakreslni kolecko
        //nakresliKolecko(zofka);

        // zofka se posune vpravo
        //zofkaSePosuneVpravo(zofka);

        // zofka nakresli slunicko
        //nakresliSlunicko(zofka);


        // zofka se posune pod slunicko
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(100);
//        zofka.turnRight(45);
//        zofka.move(100);
//        zofka.turnRight(135);
//        zofka.penDown();

        // zofka kresli domecek - 5x
//        for (int m = 0; m < 5; m++) {
//            nakresliDomecek(zofka);
//        }

        // zofka se posune do spodni casti obrazovky
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(200);
//        zofka.turnRight(90);
//        zofka.move(700);
//        zofka.turnRight(90);
//        zofka.penDown();

        // zofka nakresli domecek
//        nakresliDomecek(zofka);

        // zofka se posune o 100 px vpravo
//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(100);
//        zofka.turnLeft(90);
//        zofka.penDown();

        // zofka nakresli prasatko
//        nakresliPrasatko(zofka);

        // zofka se posune o 100 px vpravo
//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(100);
//        zofka.turnLeft(90);
//        zofka.penDown();

        // zofka nakresli domecek
//        nakresliDomecek(zofka);

        // zofka nakresli jmeno Katka
        //nakresliKatka(zofka);

        // cely obrazek
        nakresliSlunicko(zofka);
        zofkaSePosuneVpravo(zofka);
        nakresliKatka(zofka);
        // zofka se posune do spodni casti obrazovky
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.penDown();
        // zofka kresli domecek - 5x
        for (int m = 0; m < 5; m++) {
            nakresliDomecek(zofka);
        }
        // zofka se posune do spodni casti obrazovky
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.penDown();
        // zofka nakresli domecek
        nakresliDomecek(zofka);
        // zofka se posune o 100 px vpravo
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        // zofka nakresli prasatko
        nakresliPrasatko(zofka);
        // zofka se posune o 100 px vpravo
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        // zofka nakresli domecek
        nakresliDomecek(zofka);

    }


    // zofka nakresli jmeno Katka
    private void nakresliKatka(Turtle zofka) {
        nakresliK(zofka);
        mezeraMeziPismeny(zofka);
        nakresliA(zofka);
        mezeraMeziPismeny(zofka);
        mezeraMeziPismeny(zofka);
        mezeraMeziPismeny(zofka);
        nakresliT(zofka);
        mezeraMeziPismeny(zofka);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliK(zofka);
        mezeraMeziPismeny(zofka);
        nakresliA(zofka);
    }


    // pismeno T
    private void nakresliT(Turtle zofka) {
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
    }


    // pismeno A
    private void nakresliA(Turtle zofka) {
        zofka.turnRight(20);
        zofka.move(103.0776);
        zofka.turnRight(140);
        zofka.move(103.0776);
        zofka.turnLeft(180);
        zofka.move(51.5388);
        zofka.turnLeft(70);
        zofka.move(32);
        zofka.turnRight(90);
    }


    // mezera mezi pismeny
    private void mezeraMeziPismeny(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
    }


    // pismeno K
    private void nakresliK(Turtle zofka) {
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(70.71);
        zofka.turnRight(180);
        zofka.move(70.71);
        zofka.turnLeft(90);
        zofka.move(70.71);
        zofka.turnLeft(135);
    }

    // metoda pro nakresleni domecku
    private void nakresliDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
        zofka.turnRight(45);
        zofka.move(70.7106);
        zofka.turnRight(90);

        zofka.move(70.7106);
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
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
