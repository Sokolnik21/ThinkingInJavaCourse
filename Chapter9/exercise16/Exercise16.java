import java.util.*;
import java.nio.*;

class CharGenerator {
  /** Setting seed */
  static private Random rand = new Random();
  public void setSeed(int i) {
    rand = new Random(i);
  }

  /** Generating ONE random char */
  private static String CHARTABLE =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private char getRandomChar() {
    return CHARTABLE.charAt(Math.abs(rand.nextInt())%52);
  }
  private char getUpperCase() {
    return CHARTABLE.charAt(Math.abs(rand.nextInt())%26);
  }
  private char getLowerCase() {
    return CHARTABLE.charAt(Math.abs(rand.nextInt())%26 + 26);
  }

  /** Generating word */
  private String result = "";
  public String getWord(int length) {
    for(; length > 0; length--)
      result += getLowerCase();
      // result.append(getLowerCase()); it won't work becouse of different types (String/char)
    return result;
  }
}

/** Adapter Pattern */
class AdaptedCharGenerator extends CharGenerator implements Readable {
  private int count;
  public AdaptedCharGenerator(int count) { this.count = count; }
  /** It works every time there is used method hasNext() */
  public int read(CharBuffer cb) {
    /**
     *  1. CHECK: count == 0
     *  2. SUBTRACT: count --
     */
    if(count-- == 0)
      return -1;
    /** Creating 3-chars words with space */
    cb.append((new CharGenerator()).getWord(3) + " ");
    //needed to create instances becouse of specification CharGenerator class
    return 4; //amount of chars
  }
}

public class Exercise16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(new AdaptedCharGenerator(3));
    while(s.hasNext())
      System.out.println(s.next() + " ");
  }
}
