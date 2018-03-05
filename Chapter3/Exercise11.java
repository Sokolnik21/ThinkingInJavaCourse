public class Exercise11 {
  public static void main(String[] args){
    int a = 0x80000000;
    for(int i = 32; i > 0; i--) {
      System.out.println(Integer.toBinaryString(a));
      System.out.println(a);
      a >>= 1;
    }
  }
}
