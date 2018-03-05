package inheritedclass;
import baseclass.*;

public class Tree extends Plant {
  public static void growTree() {
    Plant.growPlant();
  }
  /** Cannot use method below
   * becouse it's modifier is package
   */
  // public void admireTree() {
  //   Plant.admirePlant();
  // }
}
