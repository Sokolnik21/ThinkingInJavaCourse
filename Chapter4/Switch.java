public class Switch {
  public static void main(String[] args) {
    switch(2) {
      case 1 :
      case 2 :
      case 3 : System.out.println("1-3"); break;
      case 4 : System.out.println("4"); break;
      default : System.out.println("Out of scope");
    }
  }
}
