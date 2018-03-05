import java.util.*;

interface Game {
  /** no data duplication - one instance for all implementations */
  static Random rand = new Random();
  int getResult();
}

class Coin implements Game {
  public int getResult() {
    return Math.abs(rand.nextInt()) % 2;
  }
}

class Dice implements Game {
  public int getResult() {
    return Math.abs(rand.nextInt()) % 6 + 1;
  }
}

interface GameFactory {
  Game getGame();
}

class CoinFactory implements GameFactory {
  public Game getGame() {
    return new Coin();
  }
}

class DiceFactory implements GameFactory {
  public Game getGame() {
    return new Dice();
  }
}

public class Exercise19 {
  static void playGame(GameFactory gf) {
    System.out.println(gf.getGame().getResult());
  }

  public static void main(String[] args) {
    playGame(new CoinFactory());
    playGame(new DiceFactory());

  }
}
