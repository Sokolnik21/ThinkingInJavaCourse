class MyException extends Exception {
  String content;
  MyException(String content) {
    this.content = content;
  }
  void showContent() {
    System.out.println(content);
  }
}

public class Exercise4 {
  static void getError(String name) throws MyException {
    throw new MyException(name);
  }
  public static void main(String[] args) {
    try {
      getError("U CAN'T SEE ME!");
    }
    catch(MyException me) {
      me.showContent();
    }
  }
}
