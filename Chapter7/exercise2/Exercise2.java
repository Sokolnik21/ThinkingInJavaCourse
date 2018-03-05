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

class Football extends Ball {
  Football(int diameter) {
    super(diameter);
    history += ", football";
  }
  void catchBall() {
    // System.out.println("Prevented from goal");
    history += " Prevented from goal";
  }
  void kickBall() {
    // System.out.println("Kicked");
    history += " Kicked";
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
