public class Gryzonie {
  public String toString() {
    return "Hi! I'm gryzon!";
  }
  void speak() {
    System.out.println("Pisk!");
  }
  void eat() {
    System.out.println("Skrub, skrub");
  }

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
    System.out.println("W pociągu siedzą Polak, Czech, zakonnica i modelka. " +
                      "Pociąg wjeżdża do tunelu, jest ciemno i słychać trzask. " +
                      "Po wyjeździe z tunelu Czech trzyma eis za szczękę. Zakonnica " +
                      "myśli ”było ciemno złapał modelkę za kolano no i ta mu przywaliła.” " +
                      "Modelka myśli ”było ciemno, chciał mnie złapać za kolano, " +
                      "złapał zakonnice no i ta mu przywaliła.” Czech myśli ”Polak " +
                      "złapał modelkę za kolano, a ta przez pomyłkę mi przywaliła.” " +
                      "Polak ”zaraz kolejny tunel więc znowu będę mógł przywalić Czechowi!”");
  }
  void eat() {
    System.out.println("Eating dzdzownica");
  }
}
