class Student {
  class StudentSoul {
    class DatLittleSpark {
      void describe() {
        System.out.println("Makes You different");
      }
    }
  }
}

public class Exercise19 {
  public static void main(String[] args) {
    Student s = new Student();
    Student.StudentSoul ss = s.new StudentSoul();
    Student.StudentSoul.DatLittleSpark dls = ss.new DatLittleSpark();
    dls.describe();
  }
}
