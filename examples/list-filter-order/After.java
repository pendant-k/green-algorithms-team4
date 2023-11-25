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


public class After {
  static public ArrayList<User> init() {
    ArrayList<User> list = new ArrayList<User>();

    for (int i = 1; i <= 100000; i++) {
      list.add(new User(i, "name"));
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    List<User> filteredList = list.stream()
      .filter(item -> item.id < 5)
      .collect(Collectors.toList());
    
    int count = 0;
    for (int i = 50000; i >= 1; i--) {
      for (User u : filteredList) {
        if (u.id == i) {
          count = count + 1;
        }
      }
    }
  }
}
