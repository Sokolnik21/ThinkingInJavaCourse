class A {
  A(int a) {
    System.out.println("Hello, I'm A");
  }
}
class B {
  B(int a) {
    System.out.println("Hello, I'm B");
  }
}
class C extends A {
  C() {
    super(5);
  }
  B b = new B(5);
}

public class Exercise5 {
  public static void main(String[] args) {
    C c = new C();
  }
}
