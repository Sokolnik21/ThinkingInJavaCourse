//: holding/ListFeatures.java
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

class NowString {
  static Generator g = new Generator();

  public static String[] createArray(int size) {
    String[] result = new String[size];
    for(int i = 0; i < size; i++)
      result[i] = g.getName();//rand.nextInt();
    return result;
  }
  public static ArrayList<String> arrayList(int size) {
    ArrayList<String> result = new ArrayList<String>();
    Collections.addAll(result, createArray(size));
    return result;
  }

}

public class Exercise6 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<String> nowString = NowString.arrayList(7);
    print("1: " + nowString);
    String h = new String("Hamster");
    nowString.add(h); // Automatically resizes
    print("2: " + nowString);
    print("3: " + nowString.contains(h));
    nowString.remove(h); // Remove by object
    String p = nowString.get(2);
    print("4: " +  p + " " + nowString.indexOf(p));
    String cymric = new String("Jake");
    print("5: " + nowString.indexOf(cymric));
    print("6: " + nowString.remove(cymric));
    // Must be the exact object:
    print("7: " + nowString.remove(p));
    print("8: " + nowString);
    nowString.add(3, new String("Mouse")); // Insert at an index
    print("9: " + nowString);
    List<String> sub = nowString.subList(1, 4);
    print("subList: " + sub);
    print("10: " + nowString.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + nowString.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + nowString.containsAll(sub));
    List<String> copy = new ArrayList<String>(nowString);
    sub = Arrays.asList(nowString.get(1), nowString.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<String>(nowString); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new String("Mouse")); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + nowString.isEmpty());
    nowString.clear(); // Remove all elements
    print("19: " + nowString);
    print("20: " + nowString.isEmpty());
    nowString.addAll(NowString.arrayList(4));
    print("21: " + nowString);
    Object[] o = nowString.toArray();
    print("22: " + o[3]);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
