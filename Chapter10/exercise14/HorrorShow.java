/**
  This exercise is fucking bad
  Content of this exercise is to modify this file by
  implementing anonymous class for DangerousMonster and Vampire
  But here is fucking nothing to modify
  To solve it i had to look for example solution nad guess what
  Somebody created two fucking new methods

  Content of this exercise should be: add some methods that use
  abstract class, not modify it!
 */
//: interfaces/HorrorShow.java
// Extending an interface with inheritance.

interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}

public class HorrorShow {
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public DangerousMonster createDangerousMonster() {
    return new DangerousMonster() {
      public void menace() {
        System.out.println("DangerousMonster menace");
      }
      public void destroy() {
        System.out.println("DangerousMonster destroy");
      }
    };
  }
  public Vampire createVampire() {
    return new Vampire() {
      public void menace() {
        System.out.println("Vampire menace");
      }
      public void destroy() {
        System.out.println("Vampire destroy");
      }
      public void kill() {
        System.out.println("Vampire kill");
      }
      public void drinkBlood() {
        System.out.println("Vampire drinkBlood");
      }
    };
  }
  public static void main(String[] args) {
    HorrorShow hs = new HorrorShow();
    DangerousMonster dm = hs.createDangerousMonster();
    Vampire v = hs.createVampire();
    dm.menace();
    dm.destroy();
    v.menace();
    v.destroy();
    v.kill();
    v.drinkBlood();
  }
} ///:~
