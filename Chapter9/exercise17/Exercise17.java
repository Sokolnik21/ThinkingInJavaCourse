interface IStaticFinal {
  int a = 42;
}

public class Exercise17 {
  public static void main(String[] args) {
    //Static:
    System.out.println(IStaticFinal.a);
    //Final:
    // IStaticFinal.a = 21;
  }
}
