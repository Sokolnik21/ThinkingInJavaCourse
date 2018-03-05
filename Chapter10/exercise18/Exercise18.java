class Philosopher {
  static class Stoic {
    static void describeRules() {
      System.out.println("Rules are unchangeable");
    }
  }
}

public class Exercise18 {
  public static void main(String[] args) {
    Philosopher.Stoic.describeRules();
  }
}
