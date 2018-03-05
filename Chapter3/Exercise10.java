public class Exercise10 {
  public static void main(String[] args) {
    int a = 0xaaaaaaaa;
    int b = 0x055555555;

    System.out.println("a then b");
    System.out.println(Integer.toBinaryString(a));
    System.out.println(Integer.toBinaryString(b));
    System.out.println("4 variables \n +a +b \n +a -b \n -a +b \n -a -b");
    System.out.println("a and b");
    System.out.println(Integer.toBinaryString(a & b));
    System.out.println(Integer.toBinaryString(a & ~b));
    System.out.println(Integer.toBinaryString(~a & b));
    System.out.println(Integer.toBinaryString(~a & ~b));
    System.out.println("a or b");
    System.out.println(Integer.toBinaryString(a | b));
    System.out.println(Integer.toBinaryString(a | ~b));
    System.out.println(Integer.toBinaryString(~a | b));
    System.out.println(Integer.toBinaryString(~a | ~b));
    System.out.println("a xor b");
    System.out.println(Integer.toBinaryString(a ^ b));
    System.out.println(Integer.toBinaryString(a ^ ~b));
    System.out.println(Integer.toBinaryString(~a ^ b));
    System.out.println(Integer.toBinaryString(~a ^ ~b));
  }
}
