interface IGrowable {
  void grow();
}

public class Exercise10 {
  static IGrowable learn(Boolean b) {
    if(b) {
      class Student implements IGrowable {
        public void grow() {
          System.out.println("Gain knowledge");
        }
      }
      return new Student();
    }
    else {
      class Student implements IGrowable {
        public void grow() {
          System.out.println("It's Juwenalia time!");
        }
      }
      return new Student();
    }
  }

  public static void main(String[] args) {
    Exercise10.learn(true).grow();
    Exercise10.learn(false).grow();
  }
}
