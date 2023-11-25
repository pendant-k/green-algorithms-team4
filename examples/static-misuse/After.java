import java.util.ArrayList;

class Test {
  static public ArrayList<String> convert(ArrayList<Integer> input) {
    ArrayList<String> list = new ArrayList<String>();
    for (int i: input) {
      list.add("" + i);
    }
    
    return list;
  }
}

public class After {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }

    ArrayList<String> converted = Test.convert(list);
    for (int i = 0; i < 100000; i++) {
      converted.get(i);
    }
  }
}