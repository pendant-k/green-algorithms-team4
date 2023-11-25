public class After {
  public static int function(int a) {
    if (a < 10) return a;

    int result = a / 2 + 1;
    return result;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 20; i++) {
      function(i);
    }
  }
}