public class After {
  public static int function(int a) {
    if (a < 10000) return a;

    int result = 0;
    for (int i = 0; i < 100; i++) {
      result += i;
    }
    return result;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 100000; i++) {
      function(i);
    }
  }
}