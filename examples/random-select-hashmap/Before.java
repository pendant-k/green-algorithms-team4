import java.util.ArrayList;
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

    int count = 0;
    for (int i = 1; i <= totalUsers; i++) {
      int target = random.nextInt(totalUsers) + 1; 

      for (User u : list) {
        if (u.id == target) {
          count = count + 1;
        }
      }
    }
  }
}
