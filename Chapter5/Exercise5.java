class Dog {
  void bark() {
    System.out.println("Casual bark");
  }
  void bark(char c) {
    System.out.println("Char-ming bark");
  }
  void bark(int i) {
    System.out.println("Int-elligent bark");
  }
  void bark(boolean b) {
    System.out.println("To bark or not to bark");
  }
}

public class Exercise5 {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();
    d.bark('a');
    d.bark(1);
    d.bark(true);
  }
}
