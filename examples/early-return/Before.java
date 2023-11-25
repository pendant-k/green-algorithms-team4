public class Before {
  public static int function(int a) {
    int result = a / 2 + 1;

    if (a < 10) return a;
    return result;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 20; i++) {
      function(i);
    }
  }
}
