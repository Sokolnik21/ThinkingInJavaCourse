class Amphibian {
  static void layEggs(Amphibian a) {
    System.out.println("Egg layed by Amphibian");
  }
  void layEggs() {
    System.out.println("Egg layed by noone");
  }
  void evolve(Amphibian a) {
    System.out.println("This amphibian is evolving!");
  }
}

class Frog extends Amphibian {
  void layEggs() {
    System.out.println("Egg layed by Frog");
  }
  void evolve(Frog a) {
    System.out.println("This frog is evolving!");
  }
}

public class Exercise16 {
  public static void main(String[] args) {
    Frog f = new Frog();
    Amphibian a = new Amphibian();
    Amphibian.layEggs(f);
    f.layEggs();
    f.evolve(f);
    f.evolve(a);
  }
}
