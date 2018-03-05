class Anonymous {
  String txt;
  public void sayHelloToMyLittleFriend() { };
}

public class AnonymousClass {
  public Anonymous bringBadass() {
    return new Anonymous() {
      String txt = "Hello";
      public void sayHelloToMyLittleFriend() {
        System.out.println(txt);
      }
      /** Below method doesn't exist in base class,
       * so it's not able to use
       */
      // public void dupa() {
      //   System.out.println("dupa");
      // }
    };  //semicolon is needed here
  }
  public static void main(String[] args) {
    AnonymousClass ac = new AnonymousClass();
    Anonymous a = ac.bringBadass();
    /**
     * Observation:
     * wtihout definied class Anonymous (lines: 1-4)
     * I cannot use method below
     * Why? I don't know
     */
    a.sayHelloToMyLittleFriend();
    /** Cannot use that */
    // a.dupa();
    /**
     * and here comes magic
     * it looks like anonymous class expands base class
     *
     * IMPORTANT:
     * anonymous class interface IS EXACLY THE SAME LIKE IN BASE CLASS
     * it means that anonymous class can olny have methods which
     * exists in base class
     * ADDITIONALS METHODS WON'T BE SEEN
     */
  }
}
