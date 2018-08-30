import java.util.*;

public class RegEx {
  public static void main(String[] args) {
    String sentence = args[0];
    String regex = "\\p{javaUpperCase}.*\\.";
    Boolean result = sentence.matches(regex);
    System.out.println(result);
  }
}
