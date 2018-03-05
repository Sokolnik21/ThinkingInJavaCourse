import java.util.*;

public class Exercise14 {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<Integer>();
    for(int i = 0; i < 10; i++) {
      ll.add(ll.size()/2, i);
    }
    System.out.println(ll);
  }
}
