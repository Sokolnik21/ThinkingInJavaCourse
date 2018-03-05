abstract class Wellness {
  abstract void print();
  Wellness() {
    print();
  }
}

class HealthyRelations extends Wellness {
  int i = 42;
  void print() {
    System.out.println(i);
  }
}

public class Exercise3 {
  public static void main (String[] args) {
    HealthyRelations hr = new HealthyRelations();
    hr.print();
  }
}
/**
  Output:
  0
  42
  So, two things.
  1. Base class used specialised method from inherited class.
    It happens even if base class isn't abstract and have different behaviour
    I'm not specialist in this case, but I think that it's becouse of
    the Java specification where compilator is using the most specification
    function it can get.
  2. First use "print()" produces 0
    Answer is simple. Before initialisation specialised class compilator
    first creates base class. So if base class uses some methods from
    specialised class, it do this even before initialisation where every
    varialbe is 0 or null.
  */
