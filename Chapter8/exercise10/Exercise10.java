class Tree {
  void printAB() {
    System.out.println('A');
    printB();
  }
  void printB() {
    System.out.println('B');
  }
}

class Oak extends Tree {
  void printB() {
    System.out.println("OakB");
  }
}

public class Exercise10 {
  public static void main(String[] args) {
    Oak o = new Oak();
    Tree t = (Tree)o;
    o.printAB();
    t.printAB();
    Tree trueT = new Tree();
    trueT.printAB();
  }
}
