class Root {
  Component1 c1;
  Component2 c2;
  Component3 c3;
  Root() {
    c1 = new Component1();
    c2 = new Component2();
    c3 = new Component3();
    System.out.println("Hello, I'm gRoot");
  }
  void dispose() {
    System.out.println("Bye, bye, gRoot");
    c3.dispose();
    c2.dispose();
    c1.dispose();
  }
}
class Stem extends Root {
  Stem() {
    System.out.println("Hello, I'm Stem");
  }
  void dispose() {
    System.out.println("Bye, bye, Stem");
    super.dispose();
  }
}
class Component1 {
  Component1() {
    System.out.println("Hello, I'm Component1");
  }
  void dispose() {
    System.out.println("Bye, bye, Component1");
  }
}
class Component2 {
  Component2() {
    System.out.println("Hello, I'm Component2");
  }
  void dispose() {
    System.out.println("Bye, bye, Component2");
  }
}
class Component3 {
  Component3() {
    System.out.println("Hello, I'm Component3");
  }
  void dispose() {
    System.out.println("Bye, bye, Component3");
  }
}

public class Exercise9 {
  public static void main(String[] args) {
    Stem s = new Stem();
    s.dispose();
  }
}
