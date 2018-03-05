public class Main {
  public static void main(String[] args) {
    ALotOfNothing a = new ALotOfNothing();
    System.out.println(a.intPub);
    System.out.println(a.intPac);
    System.out.println(a.intPro);
    // System.out.println(a.intPri);
    a.writePub();
    a.writePac();
    a.writePro();
    // a.writePri();
    /** Without private everythin is visible in a package */
  }
}
