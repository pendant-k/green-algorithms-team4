import java.util.ArrayList;

class Test {
  static ArrayList<String> list = new ArrayList<String>();

  static public ArrayList<String> convert(int[] input) {
    for (int i: input) {
      list.add(input.toString());
    }
    
    return list;
  }
}

public class Before {
  static int[] list;

  public void function() {
  }

  public static void main(String[] args) {
    int[] list1 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };
    int[] list2 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };
    int[] list3 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };
    int[] list4 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };
    int[] list5 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 0, 10 };

    Test.convert(list1);
    Test.convert(list2);
    Test.convert(list3);
    Test.convert(list4);
    Test.convert(list5);
  }
}