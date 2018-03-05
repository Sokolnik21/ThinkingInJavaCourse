class AlertStatus {
  public void showAlertStatus() {}
}

class RealAlert extends AlertStatus {
  public void showAlertStatus() { System.out.println("Ohh shiet. "
    + "We've got a problem "
    + "It's the real alert. Proceed with guidelines."); }
}

class TestAlert extends AlertStatus {
  public void showAlertStatus() { System.out.println("It's a test alert. "
    + "No need to panic. Proceed with guidelines."); }
}

class NoAlert extends AlertStatus {
  public void showAlertStatus() { System.out.println("Nothing is happening."); }
}

class Starship {
  private AlertStatus alert = new NoAlert();
  public void introduceTestAlert() { alert = new TestAlert(); }
  public void introduceNoAlert() { alert = new NoAlert(); }
  public void introduceRealAlert() { alert = new RealAlert(); }
  public void implementAlert() { alert.showAlertStatus(); }
}

public class Transmogrify {
  public static void main(String[] args) {
    Starship starship = new Starship();
    starship.implementAlert();

    starship.introduceTestAlert();
    starship.implementAlert();

    starship.introduceNoAlert();
    starship.implementAlert();

    starship.introduceRealAlert();
    starship.implementAlert();
  }
}
