class Apple {
  int size;
  Apple(int size) {
    this.size = size;
  }
}

class Tree {
  final Apple a;
  Tree() {
    a = new Apple(1);
  }
  void changeAppleTree(int i) {
    a.size = i;
  }
  public String toString() {
    return Integer.toString(a.size);
  }
}

public class Exercise19 {
  public static void main(String[] args) {
    Tree t = new Tree();
    System.out.println(t);
    t.changeAppleTree(2);
    System.out.println(t);
    /** Code below won't even compile
     */
    // try {
    //   t.a = new Appple(10);
    // }
    // catch(Exception e) {
    //   System.out.println("It's not possible to change final reference");
    // }
  }
}
