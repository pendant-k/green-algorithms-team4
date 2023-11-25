import java.math.BigDecimal;
import java.util.ArrayList;

class Singleton {
  private static Singleton instance;
  ArrayList<BigDecimal> data;

  public Singleton() {
    for (int i = 0; i < 10000; i++) {
      this.data.add(new BigDecimal(i));
    }
  }
}


public class Before {
  public static void main(String[] args) {
    for(int i = 0; i < 1000; i++) {
      new Singleton();
    }
  }
}
