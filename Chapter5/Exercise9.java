public class Exercise9 {
  Exercise9() {
    System.out.println("Creating new object");
  }
  Exercise9(String name) {
    this();
    System.out.println("His name is " + name);
  }
  public static void main(String[] args) {
    Exercise9 e = new Exercise9("newbie");
  }
}
