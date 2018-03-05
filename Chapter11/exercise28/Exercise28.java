import java.util.*;

public class Exercise28 {
  static Random r = new Random(74);
  public static void main(String[] args) {
    PriorityQueue p = new PriorityQueue();
    for(int i = 0; i < 11; i++)
      p.offer(r.nextDouble());
    while(p.peek() != null)
      System.out.print(p.poll() + " ");
  }
}
