interface IGuitar {
  static class GuitarString {
    /** non-static implemented method in interface */
    void toJerk() {
      System.out.println("And here comes melody");
    }
  }
}

public class Exercise20 {
  public static void main(String[] args) {
    IGuitar.GuitarString gs = new IGuitar.GuitarString();
    gs.toJerk();
  }
}
