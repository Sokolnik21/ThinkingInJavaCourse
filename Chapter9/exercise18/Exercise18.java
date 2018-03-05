interface Cycle {
  void raid();
}

class Unicycle implements Cycle {
  public void raid() { System.out.println("Unicycle go!"); }
}

class Bicycle implements Cycle {
  public void raid() { System.out.println("Bicycle go!"); }
}

class Tricycle implements Cycle {
  public void raid() { System.out.println("Tricycle go!"); }
}

interface CycleFactory {
  Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
  public Cycle getCycle() {
    return new Unicycle();
  }
}

class BicycleFactory implements CycleFactory {
  public Cycle getCycle() {
    return new Bicycle();
  }
}

class TricycleFactory implements CycleFactory {
  public Cycle getCycle() {
    return new Tricycle();
  }
}

public class Exercise18 {
  public static void rideBike(CycleFactory cf) {
    cf.getCycle().raid();
  }

  public static void main(String[] args) {
    rideBike(new UnicycleFactory());
    rideBike(new BicycleFactory());
    rideBike(new TricycleFactory());
  }
}
