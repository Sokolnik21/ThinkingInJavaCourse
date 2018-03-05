public class Ellipsis {
  public void normalInt(int[] intList) {
    for(int i : intList)
      System.out.print(i + " ");
    System.out.println("__normal__");
  }
  public void takeItAll(int... intList) {
    for(int i : intList)
      System.out.print(i + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    Ellipsis e = new Ellipsis();
    e.takeItAll(1, 2, 3);
    e.takeItAll(1, 1, 2, 3, 5, 8);
    e.takeItAll(1, 2, 4, 8);
    e.normalInt(new int[]{1, 2, 3});
  }
}
