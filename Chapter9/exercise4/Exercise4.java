abstract class Emptiness {}

class Word extends Emptiness {
  void saySomething() { System.out.println("Squanchy Party Bro"); }
}

abstract class EmptinessMore {
  abstract void saySomething();
}

class WordMore extends EmptinessMore {
  void saySomething() { System.out.println("More Squanchy Party Bro"); }
}

public class Exercise4 {
  static void sth(Emptiness e) {
    ((Word)e).saySomething();
  }
  static void sthMore(EmptinessMore e) {
    e.saySomething();
  }
  public static void main(String[] args) {
    sth(new Word());
    sthMore(new WordMore());
  }
}

/**
  The biggest difference is between method "sth()" and "sthMore()".
  In the first one it is needed to downcast (by "(Word)e") whereas
  int the second one it's not important
 */
