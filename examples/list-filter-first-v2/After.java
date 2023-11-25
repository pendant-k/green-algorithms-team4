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
    int totalUsers = 10000;

    for (int i = 1; i <= totalUsers; i++) {
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

    for (User u1 : filteredList) {
        for (User u2: filteredList) {
            if (u1.id == u2.id) {
                count += u1.id;
            }
        }
    }
  }
}
