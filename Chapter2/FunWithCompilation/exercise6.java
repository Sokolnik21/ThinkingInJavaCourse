public class exercise6 {
  public static int wielkosc(String s) {
    return s.length()*2;
  }
  public int wielkoscLokalna(String s) {
    return s.length()*2;
  }

  public static void main(String[] args) {
    String ala = "ala";
    System.out.println(exercise6.wielkosc("ala"));
    System.out.println(new exercise6().wielkoscLokalna("ala"));
  }
}
