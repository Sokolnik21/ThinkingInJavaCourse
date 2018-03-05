import java.util.*;

class Gerbil {
  int gerbilNumber;
  Gerbil(int gerbilNumber) { this.gerbilNumber = gerbilNumber; }
  void hop() { System.out.println(gerbilNumber + ". gerbil jumped now"); }
}

public class Exercise1 {
  static void display(Iterator<Gerbil> it) {
    while(it.hasNext()) {
      Gerbil g = it.next();
      g.hop();
    }
  }

  public static void main(String[] args) {
    ArrayList<Gerbil> al = new ArrayList<Gerbil>();
    for(int i = 0; i < 5; i++)
      al.add(new Gerbil(i));
    // for(Gerbil o : al)
    //   o.hop();
    display(al.iterator());
  }
}
