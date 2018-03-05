class Base1 {
  class SubBase1 {
    SubBase1() {
      System.out.println("There is always some free basement for programmer");
    }
  }
}

class Base2 {
  Base1 b1 = new Base1();
  Base1.SubBase1 sb1;
  Base2() {
    sb1 = b1.new SubBase1();
  }

  /**
   * Another solution
   * shorter, but more actions happens in one line
   * (especially line 23, where in one line situates two constructors)
   */
  // Base1.SubBase1 sb1;
  // Base2() {
  //   sb1 = new Base1().new SubBase1();
  // }


}

public class Exercise5 {
  public static void main(String[] args) {
    Base2 b2 = new Base2();
  }
}
