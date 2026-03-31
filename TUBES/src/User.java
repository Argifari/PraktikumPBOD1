public abstract class User { 
    protected String username;
    protected String email;
    protected static int counterUser = 0;

    public User() {
        counterUser++;
    }
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        counterUser++;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static int getCounterUser() {
        return counterUser;
    }

    public abstract void printInfo();

}
