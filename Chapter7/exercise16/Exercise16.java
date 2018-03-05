class Amphibian {
  static void layEggs(Amphibian a) {
    System.out.println("Egg layed by Amphibian");
  }
  void layEggs() {
    System.out.println("Egg layed");
  }
}

class Frog extends Amphibian { }

public class Exercise16 {
  public static void main(String[] args) {
    Frog f = new Frog();
    Amphibian.layEggs(f);
  }
}
