import net.mindview.util.*;

public class Exercise15 {
  static void parseString(Stack<String> stack, String s) {
    for(int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '+'  : stack.push("" + s.charAt(++i));
                    break;
        case '-'  : if(!stack.empty())
                      System.out.print(stack.pop());
        default : break;
      }
    }
  }
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    parseString(stack, "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---");
    System.out.println();
  }
}
