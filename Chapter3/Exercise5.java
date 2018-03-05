class Dog {
  String name;
  String says;

  public Dog(String name, String says){
    this.name = name;
    this.says = says;
  }
}

public class Exercise5 {
  public static void main(String[] args) {
    Dog spot = new Dog("spot", "Hau");
    Dog scruffy = new Dog("scruffy", "Wrrr");

    System.out.println(spot.name + "\n" + spot.says);
    System.out.println(scruffy.name + "\n" + scruffy.says);

    // Exercise6
    Dog azor = spot;
    System.out.println(azor == spot);
    System.out.println(azor.equals(spot));
    System.out.println(azor == scruffy);
    System.out.println(azor.equals(scruffy));
  }
}
