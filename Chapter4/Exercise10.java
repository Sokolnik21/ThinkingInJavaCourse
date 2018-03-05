import java.util.*;

public class Exercise10 {
  ArrayList<Integer> makeListFromInt(int a) {
    ArrayList<Integer> list = new ArrayList();
    int tmp = a;
    while(tmp > 0) {
      list.add(tmp % 10);
      tmp = tmp / 10;
    }
    return list;
  }
  // Horrible 4 loops with O(n^4) complexity, but it works somehow :P
  void vampiricNumber(int test) {
    ArrayList<Integer> list = makeListFromInt(test);
    int left;
    int right;
    for(int i = 0; i < list.size(); i++) {
      for(int j = 0; j < list.size(); j++) {
        if(j == i) continue;
        for(int k = 0; k < list.size(); k++) {
          if(k == j || k == i) continue;
          for(int l = 0; l < list.size() && l != k; l++) {
            if(l == k || l == j || l == i) continue;
            if(list.get(i) != 0 && list.get(k) != 0) {
              // System.out.println(list.get());
              left = list.get(i) * 10 + list.get(j);
              right = list.get(k) * 10 + list.get(l);
              // System.out.println(left);
              // System.out.println(right);
              if(left * right == test) {
                System.out.println("Liczba wampirza\n" + test + " = " + left + " * " + right);
                return;
              }
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Exercise10 vamp = new Exercise10();
    for(int i = 1000; i <= 9999; i ++) {
      vamp.vampiricNumber(i);
    }
  }
}
