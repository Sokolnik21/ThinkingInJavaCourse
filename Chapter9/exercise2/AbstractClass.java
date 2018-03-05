abstract class Love {
  void whatIsLove() {
    System.out.println(42);
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    /** Nope, You can't */
    Love l = new Love();
    l.whatIsLove();
  }
}
