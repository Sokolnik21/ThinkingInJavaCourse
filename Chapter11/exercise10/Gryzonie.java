import java.util.*;

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

  static void speakAll(ArrayList<Gryzonie> g) {
    Iterator<Gryzonie> it = g.iterator();
    while(it.hasNext()) {
      it.next().speak();
    }
  }
  static void eatAll(ArrayList<Gryzonie> g) {
    Iterator<Gryzonie> it = g.iterator();
    while(it.hasNext()) {
      it.next().eat();
    }
  }
  static void describeAll(ArrayList<Gryzonie> g) {
    Iterator<Gryzonie> it = g.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
  public static void main(String[] args) {
    RandomGryzonGenerator rgg = new RandomGryzonGenerator();
    ArrayList<Gryzonie> banda = new ArrayList<Gryzonie>();
    for(int i = 0; i < 10; i++) {
      banda.add(rgg.next());
    }
    // Iterator is not actualised after changes in array!!!
    // Iterator it = banda.iterator();

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

// Before and afer using generics
// Gryzonie.java
// Gryzonie.java:17: error: cannot find symbol
//       it.next().speak();
//                ^
//   symbol:   method speak()
//   location: class Object
// Gryzonie.java:23: error: cannot find symbol
//       it.next().eat();
//                ^
//   symbol:   method eat()
//   location: class Object
// Gryzonie.java:41: error: cannot find symbol
//     describeAll(it);
//                 ^
//   symbol:   variable it
//   location: class Gryzonie
// Gryzonie.java:42: error: cannot find symbol
//     speakAll(it);
//              ^
//   symbol:   variable it
//   location: class Gryzonie
// Gryzonie.java:43: error: cannot find symbol
//     eatAll(it);
//            ^
//   symbol:   variable it
//   location: class Gryzonie
// 5 errors
// michal@michal-vostro:~/Projects/Java/ThinkingInJava/Chapter11/exercise10$ javac Gryzonie.java
// Gryzonie.java:41: error: cannot find symbol
//     describeAll(it);
//                 ^
//   symbol:   variable it
//   location: class Gryzonie
// Gryzonie.java:42: error: cannot find symbol
//     speakAll(it);
//              ^
//   symbol:   variable it
//   location: class Gryzonie
// Gryzonie.java:43: error: cannot find symbol
//     eatAll(it);
//            ^
//   symbol:   variable it
//   location: class Gryzonie
// 3 errors
