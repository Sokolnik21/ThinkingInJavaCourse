import java.util.*;

public class Exercise31 {
  static List<Shape> s = new ArrayList<Shape>();
  public static void main(String[] args) {
    for(Object s : new RandomShapeGenerator(11))
      System.out.println(s + " ");
  }
}
