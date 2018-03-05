import secondpackage.*;
import thirdpackage.*;

public class Exercise6 {
  public static void main(String[] args) {
    Student s = new Student();
    s.useFunMethod();

    VeryGoodStudent vgs = new VeryGoodStudent();
    vgs.partyTime().relax();
  }
}
