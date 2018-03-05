public class WszystkieKoloryTeczy {
  int liczbaCalkowitaKolorow;
  void zmienOdcienKoloru (int nowyOdcien) {
    this.liczbaCalkowitaKolorow = nowyOdcien;
  }
  public static void main (String[] args) {
    WszystkieKoloryTeczy kolor = new WszystkieKoloryTeczy();
    kolor.liczbaCalkowitaKolorow = 2;
    System.out.println(kolor.liczbaCalkowitaKolorow);
    kolor.zmienOdcienKoloru(5);
    System.out.println(kolor.liczbaCalkowitaKolorow);
  }
}
