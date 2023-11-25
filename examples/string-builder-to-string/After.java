public class After {
  public static void main(String[] args) {
    int dataSize = 5000000;
    String[] stringList = new String[dataSize];

    for (int i = 0; i < dataSize; i++) {
      stringList[i] = new String("value");
    }
  }
}