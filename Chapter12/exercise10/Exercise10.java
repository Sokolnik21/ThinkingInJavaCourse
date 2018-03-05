class MyException1 extends Exception { }
class MyException2 extends Exception { }

public class Exercise10 {
  static void g() throws MyException1 {
    throw new MyException1();
  }
  static void f() throws MyException2 {
    try {
      g();
    }
    catch(MyException1 e) {
      throw new MyException2();
    }
  }
  public static void main(String[] args) {
    try {
      g();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    try {
      f();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
