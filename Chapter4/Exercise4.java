public class Exercise4 {
  public static void main(String[] args) {
    System.out.println(2);  // first prime number
    for(int i = 2; ; i++) {
      int j = 2;
      for(; j < Math.sqrt(i); j++) {
        if((i % j) == 0) break;
      }
      if((i % j) != 0) System.out.println(i);
    }
  }
}
