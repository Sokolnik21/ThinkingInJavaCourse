class MyException1 extends Exception { }

public class Exercise10 {
  static void g() throws MyException1 {
    throw new MyException1();
  }
  static void f() {
    try {
      g();
    }
    catch(MyException1 e) {
      throw new RuntimeException();
    }
  }
  public static void main(String[] args) {
    try {
      f();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
