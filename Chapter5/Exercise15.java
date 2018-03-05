public class Exercise15 {
  String something;
  {
    something = "new";
  }
  public static void main(String[] args) {
    Exercise15 e1 = new Exercise15();
    Exercise15 e2 = new Exercise15();
    System.out.println(e1.something);
    System.out.println(e2.something);
  }
}
