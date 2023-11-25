import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class User {
  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int id;
  public String name;
}


public class After {
    static int totalUsers = 10000;

    static public ArrayList<User> init() {
        ArrayList<User> list = new ArrayList<User>();

        for (int i = 1; i <= totalUsers; i+=2) {
            list.add(new User(i, "name"));
        }
        return list;
    }

  public static void main(String[] args) {
    ArrayList<User> list = init();
    long seed = 42;
    Random random = new Random(seed);

    Map<Integer, User> userMap = new HashMap<Integer, User>();
    for (User user: list) {
      userMap.put(user.id, user);
    }

    int count = 0;
    for (int i = 1; i <= totalUsers; i++) {
      int target = random.nextInt(totalUsers) + 1; 

      if (userMap.get(target) != null) {
        count = count + 1;
      }
    }
  }
}
