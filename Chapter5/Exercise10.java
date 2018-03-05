/** Funny fact
 * Garbage collector is pure shit
 * class below should create infinite loop
 * but it doesn't
 * eliciting finalize works randomly
 * 1. argument that Java is not perfect
 */
class Failure {
  protected void finalize() {
    System.out.println("My failure");
    new Failure();
    finalize();
  }
}

public class Exercise10 {
  Boolean inUse = false;
  Exercise10() {
    inUse = true;
  }
  void notInUse() {
    inUse = false;
  }
  protected void finalize() { //with "protected" this function inherits from super class
    if(inUse)
      System.out.println("Error, some Exercise10 object still in use");
  }
  public static void main(String[] args) {
    Exercise10 e1 = new Exercise10();
    e1.notInUse();
    new Exercise10();
    new Failure();

    System.gc(); //forcing to use finalize
  }
}
