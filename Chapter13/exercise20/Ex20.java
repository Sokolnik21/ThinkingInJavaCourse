import java.util.*;

class ILFDS {
  int i;
  long l;
  float f;
  double d;
  String str;
  ILFDS(String txt) {
    Scanner s = new Scanner(txt);
    i = s.nextInt();
    l = s.nextLong();
    f = s.nextFloat();
    d = s.nextDouble();
    str = s.nextLine();
  }
  public String toString() {
    return
      "Int: "     + i + "\n" +
      "Long: "    + l + "\n" +
      "Float: "   + f + "\n" +
      "Double: "  + d + "\n" +
      "String: "  + str;
  }
}

public class Ex20 {
  public static void main(String[] args) {
    String input = "1 32 1.618 1.73 and the rest";
    ILFDS i = new ILFDS(input);
    System.out.println(i);
  }
}

/*
  Output:
    Int: 1
    Long: 32
    Float: 1.618
    Double: 1.73
    String:  and the rest
*/
