public class Exercise9 {
  public static void main(String[] args){
    float f = 1;
    float bf = 1;
    double d = 1;
    double bd = 1;

    while(true){
      if(!(bf <= f) || f == Float.POSITIVE_INFINITY) {
        System.out.println("Max float: " + bf);
        break;
      }
      bf = f;
      f = f * 2;
    }
    f = 1;
    bf = 1;
    while(true){
      if(!(bf >= f) || f == 0) {
        System.out.println("Min float: " + bf);
        break;
      }
      bf = f;
      f = f / 2;
    }
    while(true){
      if(!(bd <= d) || d == Double.POSITIVE_INFINITY) {
        System.out.println("Max double: " + bd);
        break;
      }
      bd = d;
      d = d * 2;
    }
    d = 1;
    bd = 1;
    while(true){
      if(!(bd >= d) || d == 0) {
        System.out.println("Min double: " + bd);
        break;
      }
      bd = d;
      d = d / 2;
    }
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);
  }
}
