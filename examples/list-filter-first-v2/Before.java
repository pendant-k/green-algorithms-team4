import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;

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
    int totalUsers = 10000;
    int maxUserId = totalUsers / 10;
    long seed = 42;
    Random random = new Random(seed);

    for (int i = 1; i <= totalUsers; i++) {
      list.add(new User(random.nextInt(maxUserId), "name"));
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    int count = 0;

    for (User u1 : list) {
        for (User u2 : list) {
            if (u1.id < 5 && u1.id == u2.id) {
                count += 1;
            }
        }
    }
  }
}
