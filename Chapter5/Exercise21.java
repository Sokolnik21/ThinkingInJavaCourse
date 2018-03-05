enum MyEnum {
  DZIESIEC,
  DWADZIESCIA,
  PIECDZIESIAT,
  STO,
  DWIESCIE,
  PIECSET
}

public class Exercise21 {
  public static void main(String[] args) {
    for(MyEnum e: MyEnum.values())
      System.out.println(e + ": it's value is " + e.ordinal());
  }
}
