import java.util.*;

public class Exercise18 {
  private static Random rand = new Random();
  static final int i = rand.nextInt();
  final int j = rand.nextInt();
  public String toString() {
    return "Static final: " + i + "\nFinal: " + j + "\n";
  }

  public static void main(String[] args) {
    for(int i = 0; i < 3; i++)
      System.out.println(new Exercise18());
  }
}
