package access.local;

/** When there is no public modifier then
  * this class is not visible
  * outside the package
  */
public class PackagedClass {
  public PackagedClass() {
    System.out.println("Konstrukcja obiektu klasy pakietowej");
  }
}
