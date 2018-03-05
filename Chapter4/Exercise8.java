public class Exercise8 {
  public static void main(String[] args) {
    switch(3) {
      case 1 : System.out.println("1");
      case 2 :
      case 3 : System.out.println("2-3");
      case 4 : System.out.println("4");
      default : System.out.println("Out of scope");
    }
  }
}
