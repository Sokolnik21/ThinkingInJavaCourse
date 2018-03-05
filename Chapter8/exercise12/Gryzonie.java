class Heart {
  Heart(String s) {
    System.out.println("Beating heart " + s);
  }
}

public class Gryzonie {
  Heart h = new Heart("Gryzonie");
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
  Mysz() {
    System.out.println("Creating Mysz");
  }
}

class Chomik extends Gryzonie {
  Heart h = new Heart("Chomik");
  Chomik() {
    System.out.println("Creating Chomik");
  }
}

class Krecik extends Gryzonie {
  Heart h = new Heart("Krecik");
  Krecik() {
    System.out.println("Creating Krecik");
  }
}
