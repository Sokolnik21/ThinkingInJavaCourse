//: strings/Splitting.java
import java.util.*;

public class Splitting {
  public static String knights =
    "Then, when you have found the shrubbery, you must " +
    "cut down the mightiest tree in the forest... " +
    "with... a herring!";
  public static void describe() {
    System.out.println(knights);
  }
  public static void split(String regex) {
    System.out.println(
      Arrays.toString(knights.split(regex)));
  }
  public static void replace(String patternFrom, String patternTo) {
    System.out.println(
      knights.replaceAll(patternFrom, patternTo));
  }
  public static void main(String[] args) {
    describe();
    replace("[eyuioa]", "_");
  }
} /* Output:
Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!
Th_n, wh_n ___ h_v_ f__nd th_ shr_bb_r_, ___ m_st c_t d_wn th_ m_ght__st tr__ _n th_ f_r_st... w_th... _ h_rr_ng!
*///:~
