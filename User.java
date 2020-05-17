public class User {
    private String Name, lastName, password, email;


    public User(String name, String lastName, String email, String password) {
        Name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(String email) {
        this.email = email;
    }


}