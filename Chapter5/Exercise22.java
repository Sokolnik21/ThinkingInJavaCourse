enum MyEnum {
  DZIESIEC,
  DWADZIESCIA,
  PIECDZIESIAT,
  STO,
  DWIESCIE,
  PIECSET
}

public class Exercise22 {
  static void describeBanknote(MyEnum banknote) {
    switch(banknote) {
      case DZIESIEC:
      case DWADZIESCIA:
      case PIECDZIESIAT:  System.out.println("Lower than 100");
                          break;
      case STO:           System.out.println("One hundred");
                          break;
      case DWIESCIE:
      case PIECSET:
      default:            System.out.println("Higher than 100");
    }
  }
  public static void main(String[] args) {
    describeBanknote(MyEnum.DWADZIESCIA);
    describeBanknote(MyEnum.STO);
    describeBanknote(MyEnum.DWIESCIE);
    describeBanknote(MyEnum.DZIESIEC);
  }
}
