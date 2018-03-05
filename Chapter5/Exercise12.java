class Tank {
  int fuel = 0;
  Tank(int fuel) {
    this.fuel = fuel;
  }
  Tank() {
  }

  void fill(int refill) {
    fuel += refill;
  }

  void empty(int effuse) {
    if(effuse > fuel)
      fuel = 0;
    else
      fuel -= effuse;
  }

  protected void finalize() {
    if(fuel != 0)
      System.out.println("Tank not empty");
  }
}

public class Exercise12 {
  public static void main(String[] args) {
    Tank t1 = new Tank();
    new Tank();
    new Tank(1);  //sometimes it's cousing to use finalize()
    Tank t2 = new Tank(1);  //when object is created with reference then garbage
                            //collector deletes object without finalize() methode
    //IMPORTANT BELOW
    //what I said before is wrong
    //that object was'y deleted at all, becouse memory hadn't lacked
    new Tank(0);
    t1 = new Tank(0);
    t1 = new Tank(1); //now reference to object is deleting, so same object must be deleted
    t1 = new Tank(2); //^-^
    System.gc();
  }
}
