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
    zofka.turnLeft(90);
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
 }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu
    nakresliPrasatko();
    nakresliObrazce();
  }
}
