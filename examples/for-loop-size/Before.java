import java.util.ArrayList;

public class Before {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }

    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
    }
  }
}