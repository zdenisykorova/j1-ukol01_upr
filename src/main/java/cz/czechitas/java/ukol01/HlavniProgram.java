package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliDomecek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    public void nakresliNozicky() {
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(30);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(30);
    }

    public void nakresliPrasatko() {

        nakresliDomecek();
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(100);
        nakresliNozicky();
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliNozicky();
        zofka.turnRight(45);
        //ocasek
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(20);
    }

    public void nakresliKruh() {
        for (int i = 0; i < 72; i++) {
            zofka.turnRight(5);
            zofka.move(4);
        }
    }

    public void nakresliMalyKruh() {
        for (int i = 0; i < 72; i++) {
            zofka.turnRight(5);
            zofka.move(1);
        }
    }

    public void nakresliPaprsky() {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(15);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(15);
        zofka.turnLeft(90);
        for (int i = 0; i < 7; i++) {
            zofka.move(3);
            zofka.turnRight(4);
        }
    }

    public void nakresliSlunceZnovu() {
        zofka.penDown();
        for (int i = 0; i < 14; i++) {
            for (int a = 0; a < 5; a++) {
                zofka.move(5);
                zofka.turnRight(5);
            }
            zofka.penDown();
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(15);
            zofka.turnLeft(90);
            zofka.penDown();
        }
        zofka.move(3);
    }

    public void nakresliMensiPaprsky() {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(5);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(5);
        zofka.turnLeft(90);
        for (int i = 0; i < 7; i++) {
            zofka.move(1);
            zofka.turnRight(4);
        }
    }

    public void nakresliObrazce() {
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(80);
        zofka.penDown();
        //osmiúhelník
        for (int i = 0; i < 8; i++) {
            zofka.move(20);
            zofka.turnRight(45);
            zofka.move(20);
        }
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        nakresliKruh();
        zofka.penUp();
        zofka.turnLeft(20);
        zofka.move(110);
        zofka.penDown();
        nakresliKruh();
        for (int i = 0; i < 13; i++) {
            nakresliPaprsky();
        }
    }

    public void nakresliSlunce() {
        nakresliMalyKruh();
        for (int i = 0; i < 13; i++) {
            nakresliMensiPaprsky();
        }
    }
    //tragický pokus o lepší slunce v obrázku, který nevyšel
    //public void nakresliSlunceLepe() {
    //for (int i = 0; i < 45; i++) {
    //zofka.turnRight(5);
    //zofka.move(8);
    //zofka.turnRight(90);
    //zofka.move(10);
    //zofka.penUp();
    //zofka.turnRight(180);
    //zofka.move(10);
    //zofka.penDown();
    //}
    //}

    public void nakresliZ() {
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(20);
        zofka.turnRight(135);
        zofka.move(50);
        zofka.turnRight(225);
        zofka.move(20);
    }

    public void nakresliD() {
        zofka.penDown();
        zofka.move(35);
        zofka.turnRight(135);
        zofka.move(25);
        zofka.turnRight(90);
        zofka.move(25);
        zofka.penUp();
        zofka.move(30);
    }

    public void nakresliE() {
        zofka.penDown();
        zofka.move(38);
        zofka.turnRight(90);
        for (int i = 0; i < 2; i++) {
            nakresliE2();
        }
        zofka.move(20);
    }

    public void nakresliE2() {
        //část znaku E
        zofka.move(20);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(18);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliN() {
        zofka.penDown();
        zofka.move(38);
        zofka.turnRight(135);
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(38);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(38);
    }

    public void nakresliI() {
        zofka.penDown();
        zofka.move(38);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(38);
    }

    public void posunNaPismeno() {
        zofka.penUp();
        zofka.move(20);
    }

    public void start() {
        zofka = new Turtle();

        //TODO implementace domácího úkolu
        //revize úkolu 1
        //nakresliSlunceZnovu();

        //posun žofky níž
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPrasatko();
        //nakresliObrazce();

        //posun žofky na kreslení domečku 1
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnRight(45);
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(90);
        nakresliDomecek();

        //posun k domečku 2
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(65);
        zofka.penDown();
        nakresliDomecek();

        //žofka se vydává nakreslit domečky v řadě
        for (int i = 0; i < 4; i++) {
            zofka.penUp();
            zofka.turnRight(45);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.penDown();
            nakresliDomecek();
        }

        //žofka kreslí poslední domeček
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(265);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomecek();

        //napiš jméno Zdeni - původní zpracování
        /*zofka.penUp();
        zofka.turnRight(135);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(180);
        nakresliZ();
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
        nakresliD();
        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(45);
        zofka.turnLeft(90);
        zofka.move(20);
        nakresliE();
        zofka.penUp();
        zofka.move(15);
        zofka.turnLeft(90);
        nakresliN();
        zofka.turnLeft(90);
        zofka.move(15);
        zofka.turnLeft(90);
        nakresliI();*/

        //zofka píše znovu Zdeni - revize úkolu 2
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(180);
        nakresliZ();
        posunNaPismeno();
        nakresliD();
        posunNaPismeno();
        nakresliE();
        posunNaPismeno();
        nakresliN();
        posunNaPismeno();
        nakresliI();


        //zofka kreslí slunce
        zofka.turnRight(180);
        zofka.move(325);
        zofka.turnLeft(90);
        zofka.move(230);
        zofka.penDown();
        nakresliSlunce(); //původní
        //nakresliSlunceLepe(); //novější tragický pokus
    }
}
