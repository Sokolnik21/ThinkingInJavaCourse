public class Ex11 {
  public static void main(String[] args) {
    String txt = "Agata zjadła osiem ananasów i ostrygę, a Anita obyła się smakiem";
    String regex = "(?i)((^[aeiou]) | (\\s+[aeiou]))\\w+?[aeiou]\\b";
    System.out.println(txt.matches(regex));
  }
}
