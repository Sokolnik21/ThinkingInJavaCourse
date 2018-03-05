class Base {
  Base(int i) {
    System.out.println("Create base(int i)");
  }
}
class SecuredBase extends Base {
  SecuredBase() {
    super(1);
    System.out.println("Create SecuredBase()");
  }
  SecuredBase(int i) {
    super(i);
    System.out.println("Create SecuredBase(int i)");
  }
}
public class Exercise8 {
  public static void main(String[] args) {
    SecuredBase sb1 = new SecuredBase();
    SecuredBase sb2 = new SecuredBase(2);
  }
}
