public class Exercise1 {
  static void throwingGranates() throws Exception {
    throw new Exception();
  }
  public static void main(String[] args) {

    try {
      throwingGranates();
    }
    catch(Exception e) {
      System.out.println(e);
    }
    finally {
      System.out.println("Do you know da wae?");
    }
  }
}
