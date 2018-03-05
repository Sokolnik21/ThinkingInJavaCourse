class Ball {
  int diameter;
  String history;
  Ball(int diameter) {
    history = "Create ball";
    this.diameter = diameter;
  }
  void throwBall() {
    // System.out.println("Throwed");
    history += " Throwed";
  }
  void catchBall() {
    // System.out.println("Catched");
    history += " Catched";
  }
  public String toString() {
    return history;
  }
}

class Football {
  Ball b;
  Football(int diameter) {
    b = new Ball(diameter);
    b.history += ", football";
  }
  void throwBall() {
    // System.out.println("Throwed");
    /** Below is the most important change */
    b.throwBall();
  }
  void catchBall() {
    // System.out.println("Prevented from goal");
    b.history += " Prevented from goal";
  }
  void kickBall() {
    // System.out.println("Kicked");
    b.history += " Kicked";
  }
  /** toString() must be public */
  public String toString() {
    return b.history;
  }
}

public class Exercise2 {
  public static void main(String[] args) {
    Football f = new Football(15);
    f.throwBall();
    f.kickBall();
    f.catchBall();
    System.out.println(f);
    Ball b = new Ball(10);
    b.throwBall();
    b.catchBall();
    System.out.println(b);
  }
}
