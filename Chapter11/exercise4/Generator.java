import java.util.*;

public class Generator {
  static String[] theDarkTower = {
  "Roland",
  "Eddie",
  "Jake",
  "Susannah",
  "Ej",
  "Rose"
  };

  ArrayList<String> randomizedNames = new ArrayList<String>();

  static Random rand = new Random();

  void fillRandomizedNames() {
    for(int i = 0; i < theDarkTower.length; i++) {
      randomizedNames.add(rand.nextInt(randomizedNames.size() + 1), theDarkTower[i]);
    }
  }

  String getName() {
    if(randomizedNames.isEmpty() == true) fillRandomizedNames();
    String tmp = randomizedNames.get(randomizedNames.size() - 1);
    randomizedNames.remove(randomizedNames.size() - 1);
    return tmp;
  }

  public static void main(String[] args) {
    Generator g = new Generator();
    for(int i = 0; i < 15; i++)
      System.out.println(g.getName());
  }
}
