abstract class Book {
  Book(String title) {
    /** Default title */
    System.out.println(title);
  }
  abstract void playMusic();
}

class Library {
  Book getBook(String title) {
    return new Book(title){
      /** Oh God, code below is soo ugly */
      /** Wait, is this a decorator? */
      {
        System.out.println("And his name is John Cena!");
      }
      public void playMusic() {
        System.out.println("Tu-du-du-du");
      }
    };
  }
}

public class Exercise15 {
  public static void main(String[] args) {
    Library l = new Library();
    Book b = l.getBook("The Dark Tower");
    b.playMusic();
  }
}
