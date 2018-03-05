import java.util.*;

class Tree {
  private static int indexCounter = 10;
  public int index;
  Tree() {
    this.index = indexCounter++;
  }
}

public class Exercise7 {
  public static void main(String[] args) {
    Tree[] arrayTree = { new Tree(), new Tree(), new Tree(), new Tree(), new Tree() };
    List<Tree> listTree = new ArrayList<Tree>(Arrays.asList(arrayTree));
    System.out.println(listTree);
    List<Tree> subListTree = listTree.subList(1, 3);
    listTree.removeAll(subListTree);
    System.out.println(listTree);
  }
}
