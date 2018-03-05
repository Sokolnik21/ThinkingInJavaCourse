//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
// package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator implements Iterable {
  private Random rand = new Random(47);

  protected List<Shape> s = new LinkedList<Shape>();

  RandomShapeGenerator(int n) {
    for(int i = 0; i < n; i++)
      s.add(next());
  }
  public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {
      private int index = 0;
      public boolean hasNext() {
        return index < s.size();
      }
      public Shape next() {
        return s.get(index++);
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
} ///:~
