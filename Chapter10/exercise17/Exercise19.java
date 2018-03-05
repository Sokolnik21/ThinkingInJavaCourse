import java.util.*;

interface Game {
  /** no data duplication - one instance for all implementations */
  static Random rand = new Random();
  int getResult();
}

interface GameFactory {
  Game getGame();
}

class Coin implements Game {
  public int getResult() {
    return Math.abs(rand.nextInt()) % 2;
  }
  public static GameFactory factory =
    new GameFactory() {
      public Game getGame() {
        return new Coin();
      }
    };
}

class Dice implements Game {
  public int getResult() {
    return Math.abs(rand.nextInt()) % 6 + 1;
  }
  public static GameFactory factory =
    new GameFactory() {
      public Game getGame() {
        return new Dice();
      }
    };
}

class Factories {
  static void playGame(GameFactory gf) {
    System.out.println(gf.getGame().getResult());
  }
}

public class Exercise19 {
  public static void main(String[] args) {
    Factories.playGame(Coin.factory);
    Factories.playGame(Dice.factory);

  }
}
