public class exercise7 {
  static void incr() {
    StaticTest.i++;
  }
  public static void main(String[] args) {
    System.out.println(StaticTest.i);
    exercise7.incr();
    System.out.println(StaticTest.i);
  }
}
