import java.util.*;

public class Exercise5 {
  static int counter = 0;
  static Random rand = new Random();
  static Boolean fortuneTelling() {
    return rand.nextBoolean();
  }
  static Boolean godsIntervention() {
    System.out.println("After " + ++counter + ". intervention");
    return fortuneTelling();
  }
  public static void main(String[] args) {
    Boolean shouldBeTrue = fortuneTelling();
    while(!shouldBeTrue)
      try {
        shouldBeTrue = godsIntervention();
      }
      catch(Exception e) { }

    System.out.println(shouldBeTrue);
  }
}
