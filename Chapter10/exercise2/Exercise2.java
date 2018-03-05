class StringArray {
  String[] stringArray;
  private int size;
  StringArray(int size) {
    this.size = size;
    stringArray = new String[size];
  }
  public String toString() {
    String result = "";
    for(int i = 0; i < size; i++)
      result += stringArray[i] + " ";
    return result;
  }
}

public class Exercise2 {
  public static void main(String[] args) {
    StringArray sa = new StringArray(3);
    // /**
    //  * There is length instead of length() becouse table
    //  * is created at the beginning of compilation
    //  * and is considered as static
    //  */
    // System.out.println(sa.stringArray.length);
    sa.stringArray[0] = "Ala";
    sa.stringArray[1] = "Bala";
    // sa.stringArray[2] = "Cala";
    System.out.println(sa);
  }
}
