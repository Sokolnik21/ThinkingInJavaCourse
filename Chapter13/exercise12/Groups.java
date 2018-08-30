//: strings/Groups.java
import java.util.regex.*;

public class Groups {
  static int counter = 0;
  static public final String POEM =
    "Twas brillig, and the slithy toves\n" +
    "Did gyre and gimble in the wabe.\n" +
    "All mimsy were the borogoves,\n" +
    "And the mome raths outgrabe.\n\n" +
    "Beware the Jabberwock, my son,\n" +
    "The jaws that bite, the claws that catch.\n" +
    "Beware the Jubjub bird, and shun\n" +
    "The frumious Bandersnatch.";
  public static void main(String[] args) {
    Matcher m =
      Pattern.compile("\\s\\p{javaLowerCase}")
        .matcher(POEM);
    while(m.find()) counter++;
    System.out.println(counter);
  }
} /* Output:
34
*///:~
