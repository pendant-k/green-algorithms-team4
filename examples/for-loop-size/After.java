import java.util.ArrayList;

public class After {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }

    int size = list.size();
    for(int i = 0; i < size; i++) {
      System.out.print(list.get(i));
    }
  }
}