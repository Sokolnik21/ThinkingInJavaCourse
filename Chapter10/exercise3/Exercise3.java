class Outer {
  Outer() {
    System.out.println("Hello, my name is Outer");
  }
  private String secretData = "Kto nie jest samoukiem ten jest nieukiem";
  class Inner {
    Inner() {
      System.out.println("Hi! I'm Inner");
    }
  }
  Inner returnInner() {
    System.out.println(secretData);
    return new Inner();
  }
}

public class Exercise3 {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner i = o.returnInner();
  }
}
