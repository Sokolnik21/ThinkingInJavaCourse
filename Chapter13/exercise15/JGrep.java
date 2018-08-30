//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java Java "(?i)"}

import java.util.regex.*;
import net.mindview.util.*;

public class JGrep {
  public static void main(String[] args) throws Exception {
    String FLAG = "";
    if(args.length < 2) {
      System.out.println("Usage: java JGrep file regex");
      System.exit(0);
    }
    if(args.length == 3) {
      FLAG = args[2];
    }
    Pattern p = Pattern.compile(FLAG + args[1]);
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    for(String line : new TextFile(args[0])) {
      m.reset(line);
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
} /* Output: (Sample)
0: java: 18
1: java: 16
2: java: 7
3: java: 33
*///:~
