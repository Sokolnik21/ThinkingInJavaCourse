class Plant {
  final void grow() {
    System.out.println("Najważniejsze co się czuje, słuchaj zawsze głosu serca, hej.");
  }
}

class Tree extends Plant {
  // @Override
  // final void grow() {
  //   System.out.println("Głosem serca się nie kieruj, tylko forsa ważna w życiu jest.");
  // }
}

public class Exercise21 {
  public static void main(String[] args) {
    Tree t = new Tree();
    t.grow();
  }
}
