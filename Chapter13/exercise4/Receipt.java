//: strings/Receipt.java

// there are some parts in code that can be modularised
// - especially that with formating output
// ~ possible update - higher function that prepares formatted string
import java.util.*;

public class Receipt {
  static int spacing = 5;
  private double total = 0;
  private Formatter f = new Formatter(System.out);
  public void printTitle() {
    f.format("%-" + 3 * spacing + "s %" + spacing + "s %" + 2 * spacing + "s\n", "Item", "Qty", "Price");
    f.format("%-" + 3 * spacing + "s %" + spacing + "s %" + 2 * spacing + "s\n", "----", "---", "-----");
  }
  public void print(String name, int qty, double price) {
    f.format("%-" + 3 * spacing + ".15s %" + spacing + "d %" + 2 * spacing + ".2f\n", name, qty, price);
    total += price;
  }
  public void printTotal() {
    f.format("%-" + 3 * spacing + "s %" + spacing + "s %" + 2 * spacing + ".2f\n", "Tax", "", total*0.06);
    f.format("%-" + 3 * spacing + "s %" + spacing + "s %" + 2 * spacing + "s\n", "", "", "-----");
    f.format("%-" + 3 * spacing + "s %" + spacing + "s %" + 2 * spacing + ".2f\n", "Total", "",
      total * 1.06);
  }
  public static void main(String[] args) {
    Receipt receipt = new Receipt();
    receipt.printTitle();
    receipt.print("Jack's Magic Beans", 4, 4.25);
    receipt.print("Princess Peas", 3, 5.1);
    receipt.print("Three Bears Porridge", 1, 14.29);
    receipt.printTotal();
  }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
