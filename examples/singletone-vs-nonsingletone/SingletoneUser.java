public class SingletoneUser {
    private static SingletoneUser instance;
    private String username;
    private String password;

    private SingletoneUser( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SingletoneUser getInstance() {
        if (instance == null) {
            instance = new SingletoneUser( "user", "password");
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}