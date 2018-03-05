class Base {
  Base() {
    System.out.println("Create base");
  }
}

class SecuredBase extends Base { }

public class Exercise3 {
  public static void main(String[] args) {
    SecuredBase sb = new SecuredBase();
  }
}
