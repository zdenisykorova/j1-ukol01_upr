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

  public void nakresliPrasatko()  {

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
   for (int i = 0; i < 8 ; i++) {
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

 public void nakresliSlunce () {
   nakresliMalyKruh();
   for (int i = 0; i < 13; i++) {
   nakresliMensiPaprsky();
   }
 }



  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

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

    //malé sluníčko v rohu


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

    //zofka kreslí slunce
    zofka.penUp();
    zofka.turnRight(135);
    zofka.move(515);
    zofka.turnRight(90);
    zofka.move(200);
    zofka.penDown();
    nakresliSlunce();
      }



}
