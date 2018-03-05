class CharToByte {
  static void charToByte(char a) {
    /**converting char to int, then using method toBinaryString on it*/
    System.out.println(Integer.toBinaryString((int)a));
  }
}

public class Exercise13 {
  public static void main(String[] args) {
    CharToByte.charToByte('a');
    CharToByte.charToByte('b');
    CharToByte.charToByte('c');
  }
}
