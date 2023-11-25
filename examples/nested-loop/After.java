import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    for (int i = 1; i <= 1000000; i++) {
      list.add(new User(i, "name"));
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    Map<Integer, User> userMap = new HashMap<Integer, User>();
    for (User user: list) {
      userMap.put(user.id, user);
    }

    int count = 0;
    for (int i = 500000; i >= 1; i--) {
      if (userMap.get(i) != null) {
        count = count + 1;
      }
    }
  }
}
