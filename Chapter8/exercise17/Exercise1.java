class Cycle {
  void ride() {
    System.out.println("Cycle go!");
  }
}

class Unicycle extends Cycle {
  void ride() {
    System.out.println("Unicycle go!");
  }
  void balance() {
    System.out.println("Here I go! One wheel, one trip to ride.");
  }
}
class Bicycle extends Cycle {
  void ride() {
    System.out.println("Bicycle go!");
  }
  void balance() {
    System.out.println("Once You learnt it, You'll never forgot it.");
  }
}
class Tricycle extends Cycle {
  void ride() {
    System.out.println("Tricycle go!");
  }
}

class Human {
  static void travel(Cycle c) {
    c.ride();
  }
}
public class Exercise1 {
  public static void main(String[] args) {
    Cycle[] garage = {
      new Unicycle(),
      new Bicycle(),
      new Tricycle()
    };

    for(Cycle c : garage) {
      Human.travel(c);
    }
    ((Unicycle)garage[0]).balance();
    ((Bicycle)garage[1]).balance();
    //(garage[2]).balance();
  }
}
