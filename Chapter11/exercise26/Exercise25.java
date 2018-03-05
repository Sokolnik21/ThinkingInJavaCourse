import net.mindview.util.*;
import java.util.*;

class IndexString {
  String s;
  int i;
  IndexString(String s, int i) {
    this.s = s;
    this.i = i;
  }

  public String toString() { return s; }
}

public class Exercise25 {


  public static void main(String[] args) {
    List<String> list = new ArrayList<String>(new TextFile("Test.txt", "\\W+"));
    Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    int index = 0;
    for(String s : list) {
      ArrayList<Integer> updateArray = map.get(s);
      if(updateArray == null) {
        updateArray = new ArrayList<Integer>(Arrays.asList(new Integer(index++)));
      }
      else {
        updateArray.add(index++);
      }
      map.put(s, updateArray);
    }
    System.out.println(map);
    
    List<IndexString> mergedText = new ArrayList<IndexString>();
    for(String s : map.keySet())
      for(int i = 0; i < map.get(s).size(); i++)
        mergedText.add(new IndexString(s, map.get(s).get(i)));
    for(int i = 0; i < mergedText.size(); i++)
      for(int j = 0; j < mergedText.size(); j++)
        if(mergedText.get(j).i == i)
          System.out.println(mergedText.get(j));
  }
}
