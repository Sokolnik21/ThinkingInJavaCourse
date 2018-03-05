interface Gryzonie {
  void speak();
  void eat();
}

public class Exercise7 {
  static void speakAll(Gryzonie[] g) {
    for(Gryzonie e : g) {
      e.speak();
    }
  }
  static void eatAll(Gryzonie[] g) {
    for(Gryzonie e : g) {
      e.eat();
    }
  }
  static void describeAll(Gryzonie[] g) {
    for(Gryzonie e : g) {
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    RandomGryzonGenerator rgg = new RandomGryzonGenerator();
    Gryzonie[] banda = new Gryzonie[10];
    for(int i = 0; i < 10; i++) {
      banda[i] = rgg. next();
    }
    describeAll(banda);
    speakAll(banda);
    eatAll(banda);
  }
}

class Mysz implements Gryzonie {
  public String toString() {
    return "Hi! I'm mysz!";
  }
  public void eat() {
    System.out.println("Eat not so much");
  }
  public void speak() {
    System.out.println("Pisk, pisk");
  }
}

class Chomik implements Gryzonie {
  public String toString() {
    return "Hi! I'm chomik!";
  }
  public void eat() {
    System.out.println("Eat a lot!");
  }
  public void speak() {
    System.out.println("Gathering reserves");
  }
}

class Krecik implements Gryzonie {
  public String toString() {
    return "Hi! I'm krecik!";
  }
  public void speak() {
    System.out.println("Kiełbasa, a nie to trzon tenora");
  }
  public void eat() {
    System.out.println("Eating dzdzownica");
  }
}
