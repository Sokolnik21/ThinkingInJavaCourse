//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Iterator {
  boolean hasNext();
  Object next();
}

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }

  private class SequenceSelector implements Iterator {
    private int i = 0;
    public boolean hasNext() { return i < items.length && items[i] != null; }
    public Object next() {
      return items[i++];
    }
  }

  public Iterator selector() {
    return new SequenceSelector();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 7; i++)
      sequence.add(Integer.toString(i));
    Iterator iterator = sequence.selector();
    while(iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
