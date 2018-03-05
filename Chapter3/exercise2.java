public class exercise2 {
  float f;
  public static void main (String[] args){
    exercise2 a = new exercise2();
    exercise2 b = new exercise2();
    a.f = 3;
    b.f = 2;
    System.out.println(a.f + " " + b.f);
    b = a;
    System.out.println(a.f + " " + b.f);
    a.f = 0;
    System.out.println(a.f + " " + b.f);
  }
}
