class Cactus {
  void touchCactus(int i) {
    System.out.println("Int: Ouch!");
  }
  void touchCactus(char c) {
    System.out.println("Char: Ouch!");
  }
  void touchCactus(float f) {
    System.out.println("Float: Ouch!");
  }
}

class BigCactus extends Cactus {
  void touchCactus(String s) {
    System.out.println("String: Ouuuuuuu!");
  }
}

public class Exercise13 {
  public static void main(String[] args) {
    BigCactus bc = new BigCactus();
    bc.touchCactus(1);
    bc.touchCactus('a');
    bc.touchCactus(1.0f);
    bc.touchCactus("abc");
  }
}
