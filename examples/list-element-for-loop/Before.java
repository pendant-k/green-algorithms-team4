import java.util.ArrayList;

public class Before {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 1000000; i++) {
      list.add(i);
    }

    int size = list.size();
    for(int i = 0; i < size; i++) {
      Integer result = list.get(i);
      result++;
    }
  }
}