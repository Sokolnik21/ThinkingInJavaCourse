interface a {
  void f();
  void g();
}

interface b {
  void h();
  void i();
}

interface c {
  void j();
  void k();
}

interface d extends a, b, c {
  void l();
}

class Base { }

class SubBase extends Base implements d {
  public void f() { System.out.println("f"); }
  public void g() { System.out.println("g"); }
  public void h() { System.out.println("h"); }
  public void i() { System.out.println("i"); }
  public void j() { System.out.println("j"); }
  public void k() { System.out.println("k"); }
  public void l() { System.out.println("l"); }
}

public class Exercise14 {
  static void aTest(a tmp) { tmp.f(); }
  static void bTest(b tmp) { tmp.h(); }
  static void cTest(c tmp) { tmp.j(); }
  static void dTest(d tmp) { tmp.l(); }
  public static void main(String[] args) {
    SubBase sb = new SubBase();
    aTest(sb);
    bTest(sb);
    cTest(sb);
    dTest(sb);
  }
}
