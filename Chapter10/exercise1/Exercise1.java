class Outer {
  Outer() {
    System.out.println("Hello, my name is Outer");
  }
  class Inner {
    Inner() {
      System.out.println("Hi! I'm Inner");
    }
  }
  Inner returnInner() {
    return new Inner();
  }
}

public class Exercise1 {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner i = o.returnInner();
  }
}
