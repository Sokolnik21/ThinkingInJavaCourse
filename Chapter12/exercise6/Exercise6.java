import java.util.logging.*;
import java.io.*;

class MyException1 extends Exception {
  private static Logger logger =
    Logger.getLogger("MyException1");
  public MyException1() {
    StringWriter trace = new StringWriter();
    logger.severe(trace.toString());
  }
}

class MyException2 extends Exception {
  private static Logger logger =
    Logger.getLogger("MyException2");
  public MyException2() {
    StringWriter trace = new StringWriter();
    logger.severe(trace.toString());
  }
}

public class Exercise6 {
  public static void main(String[] args) {
    try {
      throw new MyException1();
    }
    catch(MyException1 e) {
      System.err.println(e);
    }
    try {
      throw new MyException2();
    }
    catch(MyException2 e) {
      System.err.println(e);
    }
  }
}
