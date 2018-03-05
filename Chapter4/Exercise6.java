public class Exercise6 {
  static Boolean test(int testval, int begin, int end) {
    return begin <= testval && testval <= end;
  }

  public static void main(String[] args) {
    System.out.println(test(1, 1, 3));
    System.out.println(test(3, 1, 3));
    System.out.println(test(2, 1, 3));
    System.out.println(test(0, 1, 3));
    System.out.println(test(4, 1, 3));
  }
}
