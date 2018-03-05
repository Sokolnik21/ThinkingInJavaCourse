package Chapter5;

public class Exercise8 {
  void foo1() {
    foo2();
    this.foo2();
  }
  void foo2() {
    System.out.println("Foo2");
  }

  public static void main(String[] args) {
    Exercise8 e = new Exercise8();
    e.foo1();
  }
}
