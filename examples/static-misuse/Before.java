import java.util.ArrayList;

class Test {
  static ArrayList<String> list = new ArrayList<String>();

  static public ArrayList<String> convert(ArrayList<Integer> input) {
    for (int i: input) {
      list.add("" + i);
    }
    
    return list;
  }
}

public class Before {
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