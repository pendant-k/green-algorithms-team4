import java.util.ArrayList;

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

    for (int i = 1; i <= 1000000; i++) {
      list.add(new User(i, "name"));
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    int count = 0;
    for (int i = 500000; i >= 1; i--) {
      for (User u : list) {
        if (u.id == i) {
          count = count + 1;
        }
      }
    }
  }
}
