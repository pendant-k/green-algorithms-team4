public class After {
    public static void main(String[] args) {
        for (int i =0; i < 1000 ; i++){
            SingletoneUser.getInstance();
        }
    }

    static class NonSingletoneUser {
        private String username;
        private String password;

        public NonSingletoneUser(String username,String password){
            this.username = username;
            this.password = password;
        };

        public String getUsername(){
            return username;
        }

        public String getPassword(){
            return password;
        }
    }

    static class SingletoneUser {
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
}
