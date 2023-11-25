import java.util.ArrayList;

class Score {
  public Score(int midtermScore, int finalScore) {
    this.midtermScore = midtermScore;
    this.finalScore = finalScore;
  }

  public int midtermScore;
  public int finalScore;
}

class User {
  public User(String name, int age, String nickname, Score score) {
    this.name = name;
    this.age = age;
    this.nickname = nickname;
    this.score = score;
  }

  public String name;
  public int age;
  public String nickname;

  public Score score;
}

public class After {
  static public ArrayList<User> init() {
    ArrayList<User> list = new ArrayList<User>();

    for (int i = 0; i < 1000000; i++) {
      Score score = getRandomScore();
      list.add(new User("name", 25, "nickname", score));
    }
    return list;
  }

  static public Score getRandomScore() {
    int midScore = 50;
    int finalScore = 50;

    return new Score(midScore, finalScore);
  }

  static public Score getUpdatedScore(Score score) {
    int midScore = score.midtermScore + 1;
    int finalScore = score.finalScore + 1;

    return new Score(midScore, finalScore);
  }

  static public void setDirectly(User user) {
    user.score = getUpdatedScore(user.score);
  }

  public static void main(String[] args) {
    ArrayList<User> list = init();

    for (User u: list) {
      setDirectly(u);
    }
  }
}
