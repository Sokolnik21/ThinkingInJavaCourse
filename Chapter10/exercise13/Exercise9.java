interface IGrowable {
  void grow();
}

public class Exercise9 {
  IGrowable learn() {
    return new IGrowable() {
      public void grow() {
        System.out.println("Gain knowledge");
      }
    };
  }

  public static void main(String[] args) {
    Exercise9 e = new Exercise9();
    IGrowable ig = e.learn();
    ig.grow();
  }
}
