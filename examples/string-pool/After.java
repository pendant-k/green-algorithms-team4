public class After {
  public static void main(String[] args) {
    int dataSize = 1000000;
    String[] literalStringArray = new String[dataSize];

    for (int i = 0; i < dataSize; i++) {
      literalStringArray[i] = "value";
    }
  }
}