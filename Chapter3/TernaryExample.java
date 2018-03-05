public class TernaryExample {
  public static void main(String[] args) {
    int i = 10;
    if(i < 5){
      System.out.println("Yes");
    }
    else System.out.println("No");
    System.out.println(i < 5 ? "Yes" : "No"); //no need for brackets () in i < 5 expression
  }
}
