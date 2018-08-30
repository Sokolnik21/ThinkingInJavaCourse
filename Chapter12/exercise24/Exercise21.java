import java.util.Random;

class BaseException extends Exception { }
class DisposeException extends Exception { }

class FailingConstructor {
  boolean exceptionWasThrown = false;
  static Random rng = new Random();
  static DisposeClass dc1;
  static DisposeClass dc2;
  FailingConstructor() throws BaseException {
    System.out.println("Creating FailingConstructor");
    try {
      dc1 = new DisposeClass();
      // Critical section - start
      if(rng.nextInt() % 2 == 0) {
        exceptionWasThrown = true;
        throw new BaseException();
      }
      // Critical section - end
      try {
        dc2 = new DisposeClass();
        System.out.println("Created FailingConstructor");
      }
      finally {
        dc2.dispose();
      }
    }
    finally {
      dc1.dispose();
      if(exceptionWasThrown)
        this.dispose();
    }
  }
  void dispose() { System.out.println("Cleaned up FailingConstructor"); }
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
      FailingConstructor fc = new FailingConstructor();
      try { }
      finally {
        fc.dispose();
      }
    }
    catch(BaseException e) {
      // To dispose FailingConstructor class after exception is thrown
      // it is needed to provide it in FailingConstructor class
      System.out.println("Caught exception in main");
    }
  }
}
