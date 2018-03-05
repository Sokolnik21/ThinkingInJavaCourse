//: interfaces/interfaceprocessor/StringProcessor.java
package interfaces.interfaceprocessor;
import java.util.*;

public abstract class StringProcessor implements Processor{
  public String name() {
    return getClass().getSimpleName();
  }
  public abstract String process(Object input);
  public static String s =
    "If she weighs the same as a duck, she's made of wood";
  public static void main(String[] args) {
    Apply.process(new Upcase(), s);
    Apply.process(new Downcase(), s);
    Apply.process(new Splitter(), s);
    Apply.process(new AProcessor(), s);
  }
}

class Upcase extends StringProcessor {
  public String process(Object input) { // Covariant return
    return ((String)input).toUpperCase();
  }
}

class Downcase extends StringProcessor {
  public String process(Object input) {
    return ((String)input).toLowerCase();
  }
}

class Splitter extends StringProcessor {
  public String process(Object input) {
    return Arrays.toString(((String)input).split(" "));
  }
}

class AProcessor implements Processor {
  private int aCounter = 0;
  private String[] list;
  private String result = "";
  public String name() { return "AProcessor"; }
   /** all You have to do is to change argument in method process(String s)
    * to process(Object i) - becouse only this way You can implement interface
    */
  public Object process(Object input) {
    list = ((String)input).split("a");
    for(String s : list) aCounter++;
    aCounter--; //there is one less "a" than blocks of text (String s)
    for(String s : list) result += s;
    while(aCounter > 0) {
      result += "a";
      aCounter--;
    }
    return result;
  }
}

 /* Output:
Using Processor Upcase
IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MADE OF WOOD
Using Processor Downcase
if she weighs the same as a duck, she's made of wood
Using Processor Splitter
[If, she, weighs, the, same, as, a, duck,, she's, made, of, wood]
*///:~
