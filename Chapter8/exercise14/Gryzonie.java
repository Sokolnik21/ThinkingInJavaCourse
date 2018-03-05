class Heart {
  Heart(String s) {
    System.out.println("Beating heart " + s);
  }
}

/** Singleton */
class Love {
  private static Love instance = null;
  protected Love() {}

  // /**
  //  * Two lines below is a "simple" way to create index
  //  * the most important is second one
  //  * there is showed that it is able to manage data while
  //  * referancing to it
  //  */
  //  private static long counter = 0;
  //  private static long id = counter++;
  // // sadly, it doesn't work :P
  private static int id = 0;

  public static Love getInstance() {
    if(instance == null) {
      System.out.println("Creating Love");
      instance = new Love();
    }
    System.out.println("Praise the sun " + id);
    id++;
    return instance;
  }
}

public class Gryzonie {
  Heart h = new Heart("Gryzonie");
  Love l = Love.getInstance();
  Gryzonie() {
    System.out.println("Creating gryzonie");
  }

  public static void main(String[] args) {
    Mysz m = new Mysz();
    Chomik ch = new Chomik();
    Krecik k = new Krecik();
    Gryzonie g = new Gryzonie();
  }
}

class Mysz extends Gryzonie {
  Heart h = new Heart("Mysz");
  Love l = Love.getInstance();
  Mysz() {
    System.out.println("Creating Mysz");
  }
}

class Chomik extends Gryzonie {
  Love l = Love.getInstance();
  Heart h = new Heart("Chomik");
  Chomik() {
    System.out.println("Creating Chomik");
  }
}

class Krecik extends Gryzonie {
  Love l = Love.getInstance();
  Heart h = new Heart("Krecik");
  Krecik() {
    System.out.println("Creating Krecik");
  }
}
