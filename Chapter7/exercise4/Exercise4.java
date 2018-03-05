class Base {
  // private Base() {
  Base() {
    System.out.println("Create base");
  }
}

class SecuredBase extends Base {
  /** When primary constructor is private
    * then it is not even possible to create
    * secondary object.
    *
    * Private methods are visible in secondary classes
    * but are forbidden to use.
    */
  SecuredBase() {
    System.out.println("Now it's secured");
  }
}

public class Exercise4 {
  public static void main(String[] args) {
    SecuredBase sb = new SecuredBase();
  }
}
