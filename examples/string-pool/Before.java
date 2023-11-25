public class Before {
  public static void main(String[] args) {
    int dataSize = 1000000;
    String[] stringObjectArray = new String[dataSize];
    
    for (int i = 0; i < dataSize; i++) {
      stringObjectArray[i] = new String("value");
    }
  }
}