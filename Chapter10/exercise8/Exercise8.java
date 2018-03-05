/**
 * it's possible to use private fields inner class
 * by outer class
 */

class Outer {
  class Inner {
    /**
     * Using static field there is also needed to
     * made this field final - to prevent from changes
     */
    private final static String test = "test String";
  }
  void useInnerPrivateField() {
    System.out.println(Inner.test);
  }
}

public class Exercise8 {
  public static void main(String[] args) {
    Outer o = new Outer();
    o.useInnerPrivateField();
  }
}
