//: polymorphism/Shapes.java
// Polymorphism in Java.
package polymorphism;
import polymorphism.shape.*;

class Star extends Shape {
  @Override
  public void draw() { System.out.println("Star.draw()"); }
  @Override
  public void erase() { System.out.println("Star.erase()"); }
  public void testFunction() { System.out.println("Shine bright like a diamod");}

}

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s) {
      shp.draw();
      shp.testFunction();
    }
    Star st = new Star();
    st.draw();
    st.testFunction();
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
