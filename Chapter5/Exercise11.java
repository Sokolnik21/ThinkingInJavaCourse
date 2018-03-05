public class Exercise11 {
  Boolean inUse = false;
  Exercise11() {
    inUse = true;
  }
  void notInUse() {
    inUse = false;
  }
  protected void finalize() { //with "protected" this function inherits from super class
    if(inUse)
      System.out.println("Error, some Exercise11 object still in use");
    finalize();
  }
  public static void main(String[] args) {
    Exercise11 e1 = new Exercise11();
    e1.notInUse();
    new Exercise11();

    System.gc(); //forcing to use finalize
  }
}
