public class Exercise12 {
  public static void main(String[] args){
    int a = 0xffffffff;
    for(int i = 31; i > 0; i--) {
      System.out.println(Integer.toBinaryString(a));
      System.out.println(a);
      a <<= 1;
    }
    for(int i = 32; i > 0; i--) {
      System.out.println(Integer.toBinaryString(a));
      System.out.println(a);
      a >>>= 1;
    }
  }
}
