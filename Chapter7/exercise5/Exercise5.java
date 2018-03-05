class A {
  A() {
    System.out.println("Hello, I'm A");
  }
}
class B {
  B() {
    System.out.println("Hello, I'm B");
  }
}
class C extends A {
  B b = new B();
}

public class Exercise5 {
  public static void main(String[] args) {
    C c = new C();
  }
}
