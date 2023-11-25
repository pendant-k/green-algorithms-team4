import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int id;
  public String name;
}


public class Before {
  static public ArrayList<User> init() {
    ArrayList<User> list = new ArrayList<User>();

    for (int i = 1; i <= 10000; i++) {
      list.add(new User(i, "name"));
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    list.stream()
      .filter(item -> item.id > 100)
      .filter(item -> item.id < 5000)
      .toArray();
  }
}
