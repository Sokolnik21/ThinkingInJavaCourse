import java.util.*;

class BetterObject extends Object { }

public class Exercise29 {
  public static void main(String[] args) {
    PriorityQueue<BetterObject> q = new PriorityQueue<BetterObject>();
    q.offer(new BetterObject());
    // Cannot add line below
    // q.offer(new BetterObject());

  //   Exception in thread "main" java.lang.ClassCastException: BetterObject cannot be cast to java.lang.Comparable
	// at java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:652)
	// at java.util.PriorityQueue.siftUp(PriorityQueue.java:647)
	// at java.util.PriorityQueue.offer(PriorityQueue.java:344)
	// at Exercise29.main(Exercise29.java:9)

    // Compilator cannot compare that objects
    // Maybe implementing method compare() can solve this problem
  }
}
