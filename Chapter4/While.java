public class While {
  static boolean condition() {
    boolean result = Math.random() < 0.99;
    System.out.print(result + ", ");
    return result;
  }

  public static void main(String[] args) {
    int i = 0;
    while(condition()){
      System.out.println("Wewnątrz 'while' " + i);
      i++;
    }
    System.out.println("Poza 'while'");
  }
}
