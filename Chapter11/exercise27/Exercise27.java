import java.util.*;

class Command {
  String s;

  Command(String s) { this.s = s; }

  void operation() {
    System.out.println(s);
  }
}

class ThirdClass {
  static void describe(Queue<Command> q) {
    while(q.peek() != null)
      q.remove().operation();
  }
}

public class Exercise27 {
  static Generator g = new Generator();
  static Queue<Command> fill(Queue<Command> q, int n) {
    for(int i = 0; i < n; i++)
      q.offer(new Command(g.getName()));
    return q;
  }
  public static void main(String[] args) {
    ThirdClass.describe(fill(new LinkedList<Command>(), 11));
  }
}
