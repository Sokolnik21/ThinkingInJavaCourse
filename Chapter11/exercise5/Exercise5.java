//: holding/ListFeatures.java
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Number {
  static Random rand = new Random(47);

  public static Integer[] createArray(int size) {
    Integer[] result = new Integer[size];
    for(int i = 0; i < size; i++)
      result[i] = rand.nextInt();
    return result;
  }
  public static ArrayList<Integer> arrayList(int size) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Collections.addAll(result, createArray(size));
    return result;
  }

}

public class Exercise5 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Integer> number = Number.arrayList(7);
    print("1: " + number);
    Integer h = new Integer(15);
    number.add(h); // Automatically resizes
    print("2: " + number);
    print("3: " + number.contains(h));
    number.remove(h); // Remove by object
    Integer p = number.get(2);
    print("4: " +  p + " " + number.indexOf(p));
    Integer cymric = new Integer(-2014573909);
    print("5: " + number.indexOf(cymric));
    print("6: " + number.remove(cymric));
    // Must be the exact object:
    print("7: " + number.remove(p));
    print("8: " + number);
    number.add(3, new Integer(42)); // Insert at an index
    print("9: " + number);
    List<Integer> sub = number.subList(1, 4);
    print("subList: " + sub);
    print("10: " + number.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + number.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + number.containsAll(sub));
    List<Integer> copy = new ArrayList<Integer>(number);
    sub = Arrays.asList(number.get(1), number.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<Integer>(number); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new Integer(42)); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + number.isEmpty());
    number.clear(); // Remove all elements
    print("19: " + number);
    print("20: " + number.isEmpty());
    number.addAll(Number.arrayList(4));
    print("21: " + number);
    Object[] o = number.toArray();
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
