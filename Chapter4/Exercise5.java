public class Exercise5 {
  static String describeBinaryInt(int a) {
    String result = "";
    int tmp;
    for(int i = 0; i < 28; i++) { //28 is needed becouse of variable a and b (they are described in 28 bits)
      tmp = ((a % 2) == 0) ? 0 : 1;
      result = tmp + result;
      a = a / 2;
    }
    return result == "" ? "0" : result;
  }
  public static void main(String[] args) {
    int a = 0xaaaaaaa;
    int b = 0x5555555;

    System.out.println("a then b");
    System.out.println(describeBinaryInt(a));
    System.out.println(describeBinaryInt(b));
    System.out.println("4 variables \n +a +b \n +a -b \n -a +b \n -a -b");
    System.out.println("a and b");
    System.out.println(describeBinaryInt(a & b));
    System.out.println(describeBinaryInt(a & ~b));
    System.out.println(describeBinaryInt(~a & b));
    System.out.println(describeBinaryInt(~a & ~b));
    System.out.println("a or b");
    System.out.println(describeBinaryInt(a | b));
    System.out.println(describeBinaryInt(a | ~b));
    System.out.println(describeBinaryInt(~a | b));
    System.out.println(describeBinaryInt(~a | ~b));
    System.out.println("a xor b");
    System.out.println(describeBinaryInt(a ^ b));
    System.out.println(describeBinaryInt(a ^ ~b));
    System.out.println(describeBinaryInt(~a ^ b));
    System.out.println(describeBinaryInt(~a ^ ~b));
  }
}
