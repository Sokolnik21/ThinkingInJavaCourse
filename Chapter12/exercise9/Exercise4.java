class MyException1 extends Exception { }

class MyException2 extends Exception { }

class MyException3 extends Exception { }

public class Exercise4 {
  static void getError(int i) throws MyException1, MyException2, MyException3 {
    switch(i) {
      case 1: throw new MyException1();
      case 2: throw new MyException2();
      default: throw new MyException3();
    }
  }
  public static void main(String[] args) {
    try {
      getError(1);
    }
    catch(Exception e) {
      // System.err.println(e);
      e.printStackTrace();
    }
  }
}
