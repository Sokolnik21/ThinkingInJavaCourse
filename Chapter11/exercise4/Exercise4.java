import java.util.*;

public class Exercise4 {
  static Generator g = new Generator();

  static Collection fill(Collection<String> collection) {
    for(int i = 0; i < 10; i++)
      collection.add(g.getName());
    return collection;
  }

  public static void main(String[] args) {
    System.out.println(fill(new ArrayList<String>()));
    System.out.println(fill(new LinkedList<String>()));
    System.out.println(fill(new HashSet<String>()));
    System.out.println(fill(new LinkedHashSet<String>()));
    System.out.println(fill(new TreeSet<String>()));
  }
}
