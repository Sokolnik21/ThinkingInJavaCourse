//: innerclasses/Sequence.java
// Holds a sequence of Objects.
import java.util.*;

interface Selector {
  boolean end();
  Object current();
  void next();
}

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(ArrayList<Integer> x) {
    if(next + x.size() - 1 < items.length) {
      for(Integer elem : x) {
        items[next++] = elem;
      }
    }
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }
  public static void main(String[] args) {
    Sequence sequence = new Sequence(13);
    for(int i = 0; i < 10; i++)
      sequence.add(new ArrayList<Integer>(Arrays.asList(i)));
    // Here is example that You can add multiple numbers at once
      sequence.add(new ArrayList<Integer>(Arrays.asList(41, 42, 43)));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
