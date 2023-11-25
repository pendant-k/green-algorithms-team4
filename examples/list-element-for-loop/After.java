import java.util.ArrayList;

public class After {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }

    for (Integer e: list) {
      System.out.print(list.get(e));
    }
  }
}