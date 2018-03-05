import java.util.*;

public class Exercise2 {
  public static void main(String[] args) {
    Random rand = new Random();
    String result;
    int test = rand.nextInt() % 100;
    for(int i = 0; i < 25; i++) {
      int tmp = rand.nextInt() % 100;
      if(tmp < test) result = "Większy";
      else if(tmp == test) result = "Równy";
      else result = "Mniejszy";
      System.out.println(result);
    }
  }
}
