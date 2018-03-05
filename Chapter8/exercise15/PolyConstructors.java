//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.

class Glyph {
  void draw() { System.out.println("Glyph.draw()"); }
  Glyph() {
    System.out.println("Glyph() before draw()");
    draw();
    System.out.println("Glyph() after draw()");
  }
}

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    System.out.println("RoundGlyph.draw(), radius = " + radius);
  }
}

class RectalngleGlyph extends Glyph {
  private int sideA = 2;
  private int sideB = 3;
  RectalngleGlyph(int a, int b) {
    sideA = a;
    sideB = b;
    System.out.println("RectalngleGlyph.RectalngleGlyph(), sideA = " + sideA +
      ", sideB " + sideB);
  }
  void draw() {
    System.out.println("RectalngleGlyph.RectalngleGlyph(), sideA = " + sideA +
      ", sideB " + sideB);
  }
}

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
    new RectalngleGlyph(4,6);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
