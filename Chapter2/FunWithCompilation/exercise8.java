public class exercise8 {
  public static int con = 7;
  public int var = 7;

  public static void main (String[] args){
    exercise8 one = new exercise8();
    exercise8 two = new exercise8();
    exercise8 three = new exercise8();
    System.out.println("Static: " + one.con + " " + two.con + " " + three.con);
    System.out.println("Variable: " + one.var + " " + two.var + " " + three.var);
    one.con = 1;
    one.var = 1;
    System.out.println("Static: " + one.con + " " + two.con + " " + three.con);
    System.out.println("Variable: " + one.var + " " + two.var + " " + three.var);
    two.con = 2;
    two.var = 2;
    System.out.println("Static: " + one.con + " " + two.con + " " + three.con);
    System.out.println("Variable: " + one.var + " " + two.var + " " + three.var);
    three.con = 3;
    three.var = 3;
    System.out.println("Static: " + one.con + " " + two.con + " " + three.con);
    System.out.println("Variable: " + one.var + " " + two.var + " " + three.var);
  }
}
