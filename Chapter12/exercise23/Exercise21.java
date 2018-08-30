import java.util.Random;

class BaseException extends Exception { }
class DisposeException extends Exception { }

class FailingConstructor {
  static Random rng = new Random();
  static DisposeClass dc1;
  static DisposeClass dc2;
  FailingConstructor() throws BaseException {
    try {
      dc1 = new DisposeClass();
      // Critical section - start
      if(rng.nextInt() % 2 == 0)
        throw new BaseException();
      // Critical section - end
      try {
        dc2 = new DisposeClass();
      }
      finally {
        dc2.dispose();
      }
    }
    finally {
      dc1.dispose();
    }
  }
}

class DisposeClass {
  static int counter = 0;
  int id = counter++;
  DisposeClass() { System.out.println("Created " + id + ". disposal object"); }
  void dispose() { System.out.println("Cleaned up disposal object " + id); }
}

public class Exercise21 {
  public static void main(String[] args) {
    try {
      FailingConstructor bc = new FailingConstructor();
    }
    catch(BaseException e) {
      System.out.println("Caught exception in main");
    }
  }
}
