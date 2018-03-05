package thirdpackage;

import listofactions.*;
import secondpackage.*;

public class VeryGoodStudent extends Student {
  public IListOfActions partyTime() {
    return this.new Fun();
  }
}
