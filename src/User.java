public class User {
    private String username = "Test";
    private String password = "TestPassword";
    //Other user-related fields and methods as needed

    public User(String username, String password) {
         this.username = username;
         this.password = password;
    }

    // Getters and setters for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "'}";
    }
    
    public static void main(String[] args) {
        System.out.println("Hello  this.getUsername()  this.getPassword() , Docker!"); 
    }
}