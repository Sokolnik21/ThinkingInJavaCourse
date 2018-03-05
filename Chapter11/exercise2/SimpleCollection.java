//: holding/SimpleCollection.java
import java.util.*;

public class SimpleCollection {
  public static void main(String[] args) {
    Set<Integer> c = new HashSet<Integer>();
    for(int i = 0; i < 10; i++)
      c.add(i); // Autoboxing

    // Another one "2" cannot be add
    c.add(2); // Autoboxing

    for(Integer i : c)
      System.out.print(i + ", ");
    System.out.println();
  }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
