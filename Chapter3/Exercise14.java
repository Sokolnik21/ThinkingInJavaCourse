public class Exercise14 {
  static void print(Object a) {
    System.out.println(a);
  }

  static void testString(String a, String b) {
    print(a.equals(b));
    print(!a.equals(b));
    print("");
  }

  public static void main(String[] args) {
    String a = "ala";
    String b = "ala";
    String c = "kot";
    String d = "long";

    Exercise14.testString(a, b);
    Exercise14.testString(a, c);
    Exercise14.testString(a, d);
  }
}
