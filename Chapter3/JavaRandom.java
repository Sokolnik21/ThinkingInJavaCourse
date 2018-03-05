import java.util.*;

public class JavaRandom {
  public static void main (String[] args) {
    int n = 100;
    int sum = 0;
    Random rand = new Random(123);  //Random(_expr_) <- _expr_ sets the key for generator
    for (int i = 0; i < n; i++) {
      System.out.println(rand.nextInt(100));
      sum += i;
    }
    System.out.println("\n"+sum/n);
  }
}
