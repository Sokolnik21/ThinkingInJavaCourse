/** Package path is important to let compiler knew where is the main file */
package exercise1.main;

import exercise1.simpleclass.*;

public class Exercise1 {
  public static void main(String[] args) {
    Tree t = new Tree();
    System.out.println(t.getLeafs() + "\n" + t.getType());
  }
}
