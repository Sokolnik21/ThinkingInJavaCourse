import java.util.*;

public class Exercise7 {
  public static void main(String[] args) {
    Random rand = new Random();
    Boolean a = new Boolean(rand.nextBoolean());
    Boolean b = new Boolean(rand.nextBoolean());
    Boolean c = new Boolean(rand.nextBoolean());

    System.out.println("All true: " + ((a && b) && c));
    System.out.println("At least one true: " + ((a || b) || c));
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
  }
}
