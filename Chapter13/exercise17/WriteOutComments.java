import java.io.*;
import java.util.*;
// even when I've imported whole java.util.* I still must explicit import both classes
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteOutComments {
  static String getText(String path) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(path));
    try {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();

      while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
      }
    String everything = sb.toString();
    return everything;
    } finally {
      br.close();
    }
  }
  static List<String> getComments(String text, String regex) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(text);
    while(m.find()) {
      System.out.println(m.group());
    }
    List<String> result = new ArrayList<String>();
    return result;
  }
  public static void main(String[] args) {
    if(args.length != 1) {
      System.err.println("1. argument should be a path to a file");
    }
    try {
      String text = getText(args[0]);
      List<String> comments = getComments(text, "//.*\\n");
    } catch(Exception e) { }
  }
}
