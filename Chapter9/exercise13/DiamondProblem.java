interface Base {
  void f();
}

interface A implements Base {
  void f();
  void g();
}

interface B implements Base {
  void f();
  void h();
}

public interface DiamondProblem implements A, B {
  void f();
  void g();
  void h();
}
