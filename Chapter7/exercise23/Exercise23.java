class Animal {
  static int describeAndInitialize(String sound) {
    System.out.println(sound);
    return 42;
  }
}

class Sheep extends Animal {
  static int age = describeAndInitialize("Bee");
}

class Horse extends Animal {
  static int value = 1000;
  static int age = describeAndInitialize("Houyhnhnm");
}

public class Exercise23 {
  public static void main(String[] args) {
    Sheep s1 = new Sheep();
    Sheep s2 = new Sheep();
    System.out.println(Horse.value);
  }
}
