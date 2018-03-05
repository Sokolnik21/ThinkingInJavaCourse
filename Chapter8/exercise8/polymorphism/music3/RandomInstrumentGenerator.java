//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.music3;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;
import java.util.*;

public class RandomInstrumentGenerator {
  private Random rand = new Random(47);
  public Instrument next() {
    switch(rand.nextInt(6)) {
      default:
      case 0: return new Wind();
      case 1: return new Woodwind();
      case 2: return new Percussion();
      case 3: return new Stringed();
      case 4: return new Brass();
      case 5: return new Guitar();
    }
  }
} ///:~
