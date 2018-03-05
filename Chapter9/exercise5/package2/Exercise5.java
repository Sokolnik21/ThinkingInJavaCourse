package package2;

import package1.*;

public class Exercise5 implements IProtocol {
  public void printA() { System.out.println("A"); }
  public void printB() { System.out.println("B"); }
  public void printC() { System.out.println("C"); }
  public static void main(String[] args) {
    Exercise5 e = new Exercise5();
    e.printA();
  }
}

//run in folder Chapter9/exercise5
