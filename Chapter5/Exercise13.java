class Roland {
  Roland(String phrase) {
    System.out.println("Ka " + phrase);
  }
  static void destiny() {
    System.out.println("The Journey");
  }
}

class LastFloor {
  static Roland r1;
  static {
    r1 = new Roland("now");
    r1 = new Roland("in the past");
    r2 = new Roland("in the future");
  }
  static Roland r2;
  LastFloor() {
    System.out.println("never ends");
  }
}

public class Exercise13 {
  public static void main(String[] args) {
    // Roland.destiny();
    LastFloor.r1.destiny();
    LastFloor lf = new LastFloor(); //static LastFloor lf = new LastFloor(); doesn't work
  }
}
