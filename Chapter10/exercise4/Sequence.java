//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}

public class Sequence {
  /** test object */
  public String word = "Bird is the Word";
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }
  /** change from private to public to make objects of this class visible */
  public class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
    /** added method */
    Sequence sequenceReference() {
      return Sequence.this;
    }
  }
  public Selector selector() {
    return new SequenceSelector();
  }
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
    /** TEST sequenceReference() */
    SequenceSelector sr = sequence.new SequenceSelector();
    System.out.println(sr.sequenceReference().word);
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
