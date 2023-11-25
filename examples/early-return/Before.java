public class Before {
  public static int function(int a) {
    int result = 0;
    for (int i = 0; i < 100000; i++) {
      result += i;
    }

    if (a < 9999) return a;
    return result;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 10000; i++) {
      function(i);
    }
  }
}
