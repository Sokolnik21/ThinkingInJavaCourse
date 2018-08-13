class BaseException extends Exception { }

class BaseClass {
  BaseClass() throws BaseException {
    throw new BaseException();
  }
}

class SpecClass extends BaseClass {
  SpecClass() throws BaseException {
    // #1
    // try {
    //   super();
    // }
    // catch(BaseException e) {
    //   System.out.println("Caught exception in specialized class");
    //   throw e;
    // }
  }
}

public class Exercise21 {
  public static void main(String[] args) {
    try {
      SpecClass sc = new SpecClass();
    }
    catch(BaseException e) {
      System.out.println("Caught exception in main");
    }
  }
}

// #1
// To handle exception, first I need to invoke base class constructor with super() method.
// Unfortunately, I also must be able to catch it, so the super() method must be in try block.
// Unfortunately x2, when I want to use super() method, I must provide that super() will be the first statement in the constructor.
// That leads to vicious cycle that implicates impossibility of that method.
