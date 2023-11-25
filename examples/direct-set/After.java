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

    for (int i = 0; i < 100000; i++) {
      Score score = getAnotherScore();
      list.add(new User("name", 25, "nickname", score));
    }
    return list;
  }

  static public Score getAnotherScore() {
    int midScore = (int) Math.random();
    int finalScore = (int) Math.random();

    return new Score(midScore, finalScore);
  }

  static public void setDirectly(User user) {
    Score newScore = getAnotherScore();

    user.score.midtermScore = newScore.midtermScore;
    user.score.finalScore = newScore.finalScore;
  }

  public static void main(String[] args) {
    ArrayList<User> list = new ArrayList<User>();

    for (int i = 0; i < 100000; i++) {
      Score score = getAnotherScore();
      list.add(new User("name", 25, "nickname", score));
    }

    for (User u: list) {
      setDirectly(u);
    }
  }
}
