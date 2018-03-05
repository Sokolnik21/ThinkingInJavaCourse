import static debug.Debug.*;
import static debugoff.Debug.*;

public class Exercise3 {
  public static void main(String[] args) {
    debug("debug");
    debug();
    System.out.println(debugoff.Debug.c);
  }
}
