import java.util.*;

public class Exercise4 {
  public static void main(String[] args) {
    float time;
    float length;
    Random rand = new Random();
    time = rand.nextInt(21) + 1;
    length = rand.nextInt(21) + 1;
    System.out.println(length);
    System.out.println(time);
    System.out.println(length/time);
  }
}
