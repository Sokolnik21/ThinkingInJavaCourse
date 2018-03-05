//: polymorphism/shape/Circle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }
  public void testFunction() { System.out.println("They see me rolling");}
  // @Override
  // public void wrong() {
  //   print("wololo");
  // }
} ///:~
