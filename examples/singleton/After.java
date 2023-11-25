import java.math.BigDecimal;
import java.util.ArrayList;

class Singleton {
  private static Singleton instance;
  ArrayList<BigDecimal> data;

  public Singleton() {
    this.data = new ArrayList<BigDecimal>();
    
    for (int i = 0; i < 10000; i++) {
      this.data.add(new BigDecimal(i));
    }
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
      return instance;
    }

    return instance;
  }
}

public class After {
  public static void main(String[] args) {
    for(int i = 0; i < 1000; i++) {
      Singleton.getInstance();
    }
  }
}
