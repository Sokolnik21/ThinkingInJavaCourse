class Connection {
  public String s;
  static Connection makeConnection(String s) {
    return new Connection(s);
  }
  private Connection(String s) {
    this.s = s;
  }
}

public class ConnectionManager {
  private int tableSize = 5;
  private static int actualObject = 0;
  private Connection[] table = new Connection[tableSize];
  public Connection createConnection(String s) {
    if(actualObject >= tableSize) {
      return null;
    }
    else {
      table[actualObject] = Connection.makeConnection(s);
      actualObject += 1;
      return table[actualObject - 1];
    }
  }
  public static void main(String[] args) {
    ConnectionManager cm = new ConnectionManager();
    for(int i = 0; i < 7; i++){
      // System.out.println(cm.createConnection(Integer.toString(i)).s);
      System.out.println(cm.createConnection(Integer.toString(i)));
    }
  }
}
