class String1 {
  String s = "default";
  String1() {}; // {} brackets are needed in constructor
}

class String2 {
  String s;
  String2(String s) { this.s = s; };
}

public class Exercise2 {
  public static void main(String[] args) {
    String1 s1 = new String1();
    String2 s2 = new String2("myValue");
    System.out.println(s1.s);
    System.out.println(s2.s);
  }
}
