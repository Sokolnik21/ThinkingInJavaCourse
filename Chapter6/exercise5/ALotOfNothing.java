public class ALotOfNothing {
  public int intPub = 0;
  int intPac = 1;
  protected int intPro = 2;
  private int intPri = 3;

  public void writePub() {
    System.out.println("Public");
  }
  void writePac() {
    System.out.println("Package");
  }
  protected void writePro() {
    System.out.println("Protected");
  }
  private void writePri() {
    System.out.println("Private");
  }
}
