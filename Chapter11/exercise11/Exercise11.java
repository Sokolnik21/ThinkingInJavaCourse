import java.util.*;

class DarkCharacter {
  static private Generator g = new Generator();
  String name;
  DarkCharacter() { this.name = g.getName(); }
  public String toString() { return name; }
}

public class Exercise11 {
  void describeCollection(Collection<DarkCharacter> dc) {
    Iterator it = dc.iterator();
    while(it.hasNext())
      System.out.print(it.next() + ", ");
    System.out.println();
  }
  void fillCollection(Collection<DarkCharacter> dc, int n) {
    for(int i = 0; i < n; i++) {
      dc.add(new DarkCharacter());
    }
  }
  public static void main(String[] args) {
    Exercise11 e = new Exercise11();
    ArrayList<DarkCharacter> al = new ArrayList<DarkCharacter>();
    LinkedList<DarkCharacter> ll = new LinkedList<DarkCharacter>();
    HashSet<DarkCharacter> hs = new HashSet<DarkCharacter>();
    LinkedHashSet<DarkCharacter> lhs = new LinkedHashSet<DarkCharacter>();
    TreeSet<DarkCharacter> ts = new TreeSet<DarkCharacter>();
    e.fillCollection(al, 10);
    e.fillCollection(ll, 10);
    e.fillCollection(hs, 10);
    e.fillCollection(lhs, 10);
    // e.fillCollection(ts, 10); // Problem: cannot compare DarkCharacter objects
    e.describeCollection(al);
    e.describeCollection(ll);
    e.describeCollection(hs);
    e.describeCollection(lhs);
    e.describeCollection(ts);
  }
}
