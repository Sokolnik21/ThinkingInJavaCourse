import simpletree.*;
import mytree.*;

public class Main {
  public static void main(String[] args) {
    simpletree.Tree t = new simpletree.Tree();
    t.h = 10;
    System.out.println(t.h);

    /** Spostrzeżenia:
     * nawet kiedy obie klasy są identyczne, nadal występuje kolizja
     */
  }
}
