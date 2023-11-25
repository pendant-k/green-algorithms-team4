import java.util.LinkedList;

public class Before {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();

    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }
  }
}
