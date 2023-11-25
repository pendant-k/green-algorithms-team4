public class Before {
  public static void main(String[] args) {
    int dataSize = 5000000;

    for (int i = 0; i < dataSize; i++) {
      new StringBuilder().append("value");
    }
  }
}