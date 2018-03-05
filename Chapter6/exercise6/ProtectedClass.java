class Family {
  /** Visible like package */
  protected int income = 1337;
  /** Visible only in class */
  private int incomePri = 1337;
}

class Country {
  public void work(Family f) {
    f.income += 100;
  }
}

public class ProtectedClass {
  public static void main(String[] args) {
    Family f = new Family();
    /** Test */
    System.out.println(f.income);
    Country c = new Country();
    c.work(f);
    /** Test */
    System.out.println(f.income);
  }
}
