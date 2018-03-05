interface IGrowable {
  void grow();
}

public class Exercise9 {
  static IGrowable learn() {
    class Student implements IGrowable {
      public void grow() {
        System.out.println("Gain knowledge");
      }
    }
    return new Student();
  }

  public static void main(String[] args) {
    Exercise9.learn().grow();
  }
}
