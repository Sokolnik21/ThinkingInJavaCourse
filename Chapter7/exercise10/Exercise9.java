class Root {
  Root() {
    System.out.println("Hello, I'm gRoot");
  }
}
class Stem extends Root {
  Stem() {
    System.out.println("Hello, I'm Stem");
  }
}
class Component1 {
  Component1() {
    System.out.println("Hello, I'm Component1");
  }
}
class Component2 {
  Component2() {
    System.out.println("Hello, I'm Component2");
  }
}
class Component3 {
  Component3() {
    System.out.println("Hello, I'm Component3");
  }
}

public class Exercise9 {
  public static void main(String[] args) {
    Stem s = new Stem();
  }
}
