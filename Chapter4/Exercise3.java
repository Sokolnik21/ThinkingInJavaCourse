import java.util.*;

public class Exercise3 {
  public static void main(String[] args) {
    Random rand = new Random();
    String result;
    int test = rand.nextInt() % 100;
    while(true) {
      int tmp = rand.nextInt() % 100;
      if(tmp < test) result = "Większy";
      else if(tmp == test) result = "Równy";
      else result = "Mniejszy";
      System.out.println(result);
    }
  }
}
