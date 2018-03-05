public class Exercise4 {
  Exercise4() {
    System.out.println("Constructor");
  }
  Exercise4(String s) {
    System.out.println("Constructor " + s);
  }

  public static void main(String[] args) {
    Exercise4 e1 = new Exercise4();
    Exercise4 e2 = new Exercise4("with string as argument");
  }
}
