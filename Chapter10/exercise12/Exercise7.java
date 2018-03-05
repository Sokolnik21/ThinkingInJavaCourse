interface Inner {
  void getSecret();
  void permissionGrantedToSquat();
}

class PrivateClass {
  private String secret = "It's secret to everybody";
  private void toSquat() {
    String result =
      "                    _             \n" +
      "                   (_)            \n" +
      " _ __ _   _ ___ ___ _  __ _ _ __  \n" +
      "| '__| | | / __/ __| |/ _` | '_ \\ \n" +
      "| |  | |_| \\__ \\__ \\ | (_| | | | |\n" +
      "|_|   \\__,_|___/___/_|\\__,_|_| |_|\n";
    System.out.println(result);
  }
  public Inner createInner() {
    return new Inner() {
      public void getSecret() {
        secret = "Secret taken";
      }
      public void permissionGrantedToSquat() {
        toSquat();
      }
    };
  }
  void changeData() {
    Inner i = createInner();
    i.getSecret();
    System.out.println(secret);
    i.permissionGrantedToSquat();
  }
}

public class Exercise7 {
  public static void main(String[] args) {
    PrivateClass pc = new PrivateClass();
    pc.changeData();
  }
}
