/** Package path is important to let compipler knew where is the class  file */
package exercise1.simpleclass;

public class Tree {
  int leafs;
  String type;

  public Tree() {
    this.leafs = 0;
    this.type = "just a tree";
  }
  public Tree(int leafs, String type) {
    this.leafs = leafs;
    this.type = type;
  }
  public int getLeafs() {
    return this.leafs;
  }
  public String getType() {
    return this.type;
  }
}
