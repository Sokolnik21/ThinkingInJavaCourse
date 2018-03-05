class Cycle {
  void ride() {
    System.out.println(wheels() + "-cycle go!");
  }
  int wheels() { return 0; }
}

class Unicycle extends Cycle {
  // void ride() {
  //   System.out.println("Unicycle go!");
  // }
  int wheels() { return 1; }
}
class Bicycle extends Cycle {
  // void ride() {
  //   System.out.println("Bicycle go!");
  // }
  int wheels() { return 2; }
}
class Tricycle extends Cycle {
  // void ride() {
  //   System.out.println("Tricycle go!");
  // }
  int wheels() { return 3; }
}

class Human {
  static void travel(Cycle c) {
    c.ride();
  }
}
public class Exercise1 {
  public static void main(String[] args) {
    Unicycle u = new Unicycle();
    Bicycle b = new Bicycle();
    Tricycle t = new Tricycle();
    Human.travel(u);
    Human.travel(b);
    Human.travel(t);
    /**
    How does polymorph work?
    If service is called on object then it use
    THE MOST SPECIFIC METHOD.
    What does it mean?
    Java first check all the most specific services.
    If noone pass, then it goes deeper until something fills in.
    */
    Cycle c = new Cycle();
    Human.travel(c);
  }
}
