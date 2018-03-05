//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
import java.util.*;

public class RandomGryzonGenerator {
  private Random rand = new Random();
  public Gryzonie next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Mysz();
      case 1: return new Chomik();
      case 2: return new Krecik();
    }
  }
} ///:~
