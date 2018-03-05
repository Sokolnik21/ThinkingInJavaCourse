interface IGrowable {
  void grow();
}

class University {
  private class Student implements IGrowable {
    public void grow() {
      System.out.println("Gain knowledge");
    }
  }
  Student s = new Student();

  public IGrowable getStudent() {
    return s;
  }
}

public class Exercise11 {
  public static void main(String[] args) {
  University e = new University();
  IGrowable ig = e.getStudent();
  ig.grow();
  /** Cannot compile code below, compiler cannot find Student class */
  // Student s1 = (Student)ig;
  // s1.grow();
  }
}
