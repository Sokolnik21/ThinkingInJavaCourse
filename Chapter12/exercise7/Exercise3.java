import java.util.logging.*;
import java.io.*;

public class Exercise3 {
  static int error = 1;
  static void printTable(int[] s) {
    for(int i = 0; i < s.length + error; i ++)
      System.out.println(s[i]);
  }

  public static void main(String[] args) {
    int[] t = { 1, 2, 3, 4, 5 };
    try{
      printTable(t);
    }
    catch(Exception e) {
      Logger logger = Logger.getLogger("Chapter12.Exercise3");
      StringWriter trace = new StringWriter();
      e.printStackTrace(new PrintWriter(trace));
      logger.severe(trace.toString());

      System.out.println(e);
      System.out.println("Git gut!");
    }
  }
}
