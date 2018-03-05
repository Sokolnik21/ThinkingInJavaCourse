class Leafs {
  String color;
  Leafs(String color) {
    this.color = color;
  }
  public String toString() {
    return color;
  }
}

class Tree {
  Leafs a;
  public String toString() {
    a = new Leafs("green");
    return  "This is a tree with " + a + " leafs.";
  }
}

public class Exercise1 {
  public static void main(String[] args) {
    Tree t = new Tree();
    System.out.println(t);
  }
}
