import net.mindview.util.*;
import java.util.*;

public class Exercise16 {
  static Set<String> vowels =
    new TreeSet<String>(Arrays.asList("e y u i o a E Y U I O A".split(" ")));

  static int vowelsInWord(String s) {
    for(int i = 0; i < s.length(); i++) {
      
    }
  }

  public static void main(String[] args) {
    Set<String> text = new TreeSet<String>(new TextFile("Test.txt", "\\W+"));
    System.out.println(vowels);
  }
}
