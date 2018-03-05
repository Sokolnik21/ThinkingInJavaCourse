class Cycle {
  void ride() {
    System.out.println("Cycle go!");
  }
}

class Unicycle extends Cycle {
  void ride() {
    System.out.println("Unicycle go!");
  }
}
class Bicycle extends Cycle {
  void ride() {
    System.out.println("Bicycle go!");
  }
}
class Tricycle extends Cycle {
  void ride() {
    System.out.println("Tricycle go!");
  }
}

class DamnTricycle extends Tricycle {
  void ride() {
    System.out.println("DamnTricycle go!");
  }
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

    DamnTricycle d = new DamnTricycle();
    Human.travel(d);
  }
}
