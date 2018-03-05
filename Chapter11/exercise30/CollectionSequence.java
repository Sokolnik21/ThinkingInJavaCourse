//: holding/CollectionSequence.java
import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence
implements Collection<Pet> {
  public void clear() { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean retainAll(Collection<?> c) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public void removeAll() { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean removeAll(Collection<?> c) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean addAll(Collection<? extends Pet> c) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean containsAll(Collection<?> c) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean remove(Object o) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean add(Pet p) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public <T> T[] toArray(T[] elementType) { // Not implemented
    throw new UnsupportedOperationException();
  }  // <-git gut
  public Object[] toArray() { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean contains(Object o) { // Not implemented
    throw new UnsupportedOperationException();
  }
  public boolean isEmpty() { // Not implemented
    throw new UnsupportedOperationException();
  }
  // public <Pet> toArray(Pet[] p) { };
  // public void <T>toArray(T[] t) {};


  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
