public class Exercise9 {
  void fib(int a) {
    for(int i = 1; i < a; i++) {
      System.out.print(fibNumber(i) + ", ");
    }
    System.out.println(fibNumber(a));
  }
  int fibNumber(int a) {
    if(a == 1 || a == 2) return 1;
    else return fibNumber(a - 1) + fibNumber(a - 2);
  }
  public static void main(String[] sgra) {
    int a = 2;
    int b = 5;
    int c = 10;
    int d = 21;
    Exercise9 fib = new Exercise9();
    fib.fib(a);
    fib.fib(b);
    fib.fib(c);
    fib.fib(d);
  }
}
