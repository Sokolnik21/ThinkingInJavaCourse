interface Cycle {
  void raid();
}

interface CycleFactory {
  Cycle getCycle();
}

class Unicycle implements Cycle {
  public void raid() { System.out.println("Unicycle go!"); }
  public static CycleFactory factory =
    new CycleFactory() {
      public Cycle getCycle() {
        return new Unicycle();
      }
    };
}

class Bicycle implements Cycle {
  public void raid() { System.out.println("Bicycle go!"); }
  public static CycleFactory factory =
    new CycleFactory() {
      public Cycle getCycle() {
        return new Bicycle();
      }
    };
}

class Tricycle implements Cycle {
  public void raid() { System.out.println("Tricycle go!"); }
  public static CycleFactory factory =
    new CycleFactory() {
      public Cycle getCycle() {
        return new Tricycle();
      }
    };
}

class Factories {
  public static void rideBike(CycleFactory cf) {
    cf.getCycle().raid();
  }
}

public class Exercise18 {
  public static void main(String[] args) {
    Factories f = new Factories();
    f.rideBike(Unicycle.factory);
    f.rideBike(Bicycle.factory);
    f.rideBike(Tricycle.factory);
  }
}
