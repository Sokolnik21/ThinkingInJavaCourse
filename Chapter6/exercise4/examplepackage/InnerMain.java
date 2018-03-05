/** Writing package is very important
 * when you run program from different catalog
 */
package examplepackage;

import examplepackage.Counter.*;

public class InnerMain {
  public static void main(String[] args) {
    System.out.println(Counter.count(1, 2));
  }
}
