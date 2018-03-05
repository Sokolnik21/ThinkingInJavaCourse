interface IChords {
  String playC();
  String playD();
  static class Song {
    static void playSong(IChords ch) {
      System.out.println(ch.playC() + ", " + ch.playD());
    }
  }
}

class Guitar implements IChords {
  public String playC() { return "Guitar C"; }
  public String playD() { return "Guitar D"; }
}

class Piano implements IChords {
  public String playC() { return "Piano C"; }
  public String playD() { return "Piano D"; }
}

public class Exercise21 {
  public static void main(String[] args) {
    Guitar.Song.playSong(new Guitar());
    Piano.Song.playSong(new Piano());
  }
}
