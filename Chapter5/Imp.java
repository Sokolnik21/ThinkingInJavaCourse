class Demon {
  int age;
  String roar;

  //**Silent demon*/
  Demon(int age, String roar) {
    this.age = age;
    this.roar = roar;
  }

  //**Wild demon*/
  Demon(String roar, int age) {
    this.age = age;
    this.roar = roar;
    System.out.println("Roooooooooaaaaaaaar");
  }
}

public class Imp {
  public static void main(String[] args) {
    Demon d1 = new Demon(665, "Strawberries");
    Demon d2 = new Demon("Mushrooms", 667);
  }
}
