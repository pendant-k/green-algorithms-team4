public class Before {
  public static void main(String[] args) {
    int dataSize = 5000000;
    StringBuilder[] stringBuilderList = new StringBuilder[dataSize];

    for (int i = 0; i < dataSize; i++) {
      stringBuilderList[i] = new StringBuilder().append("value");
    }
  }
}