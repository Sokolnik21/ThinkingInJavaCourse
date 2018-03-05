public abstract class Gryzonie {
  abstract public String toString();
  void speak() {
    System.out.println("Pisk!");
  }
  abstract void eat();

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

class Mysz extends Gryzonie {
  public String toString() {
    return "Hi! I'm mysz!";
  }
  void eat() {
    System.out.println("Eat not much");
  }
}

class Chomik extends Gryzonie {
  public String toString() {
    return "Hi! I'm chomik!";
  }
  void eat() {
    System.out.println("Eat a lot!");
  }
}

class Krecik extends Gryzonie {
  public String toString() {
    return "Hi! I'm krecik!";
  }
  void speak() {
    System.out.println("Schodzi pan po schodach w hotelu i mówi do recepcjonistki: "
    + "\n-Zaslałem łóżko\n-To dobrze\n-Nie baldzo");
  }
  void eat() {
    System.out.println("Eating dzdzownica");
  }
}
