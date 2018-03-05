import java.util.*;

public class Exercise12 {
  static void fillArrays(List<Integer> l1, List<Integer> l2) {
    for(int i = 0; i < 7; i++) {
      l1.add(i);
      l2.add(i + 10);
    }
  }
  public static void main(String[] args) {
    List<Integer> l1 = new LinkedList<Integer>();
    List<Integer> l2 = new LinkedList<Integer>();
    fillArrays(l1, l2);
    // 1.
    ListIterator<Integer> it = l1.listIterator();
    while(it.hasNext()) { it.next(); }
    while(it.hasPrevious()) { l2.add(it.previous()); }
    System.out.println(l2);
    // 2.
    l1 = new LinkedList<Integer>();
    l2 = new LinkedList<Integer>();
    fillArrays(l1, l2);
    it = l1.listIterator(l1.size());
    while(it.hasPrevious()) { l2.add(it.previous()); }
    System.out.println(l2);
  }
}
