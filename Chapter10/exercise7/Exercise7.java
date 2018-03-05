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
  class Inner {
    void getSecret() {
      secret = "Secret taken";
    }
    void permissionGrantedToSquat() {
      toSquat();
    }
  }
  void changeData() {
    Inner i = new Inner();
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
