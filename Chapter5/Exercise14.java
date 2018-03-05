public class Exercise14 {
  static String aStr = "a";
  static String bStr;
  static {
    bStr = "b";
  }
  static void describe() {
    System.out.println(aStr + "\n" + bStr);
  }
  public static void main(String[] args) {
    Exercise14.describe();
  }
}
