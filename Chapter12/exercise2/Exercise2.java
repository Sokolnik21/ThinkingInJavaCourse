public class Exercise2 {
  static void add42(Integer i) {
    System.out.println(i + 42);
  }
  public static void main(String[] args) {
    Integer i = null;
    System.out.println(i);
    // add42(i);

    try {
      add42(i);
    }
    catch (Exception e) {
      System.out.println(e);
      System.out.println("We got this!");
    }
  }
}
