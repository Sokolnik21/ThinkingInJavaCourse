package secondpackage;

import listofactions.*;

public class Student {
  protected class Fun implements IListOfActions {
    /**
     * GOD!!!
     * default constructor has package visibility
     */
    public Fun() { };
    public void relax() {
      System.out.println("Read some good book");
    }
  }
  public void useFunMethod() {
    new Fun().relax();
  }
}
