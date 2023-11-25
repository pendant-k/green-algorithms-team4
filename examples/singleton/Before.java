import java.math.BigDecimal;
import java.util.ArrayList;

class Singleton {
  ArrayList<BigDecimal> data;

  public Singleton() {
    this.data = new ArrayList<BigDecimal>();
    
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
