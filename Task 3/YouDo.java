class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

class EmailValidator {
    public static boolean isValid(String email) {
        if (email != null && email.contains("@")) {
            return true;
        }

        System.out.println("Invalid Email Format");
        return false;
    }
}

class UserRepository {
    public void save(User user) {

        if (EmailValidator.isValid(user.getEmail())) {

            System.out.println("Connecting to database.....");
            System.out.println("Saving user " + user.getUsername() + "to the user table");
        }

    }
}

public class main {
    public static void main(String[] args){
        User user = new User("Rahim", "rahim@gmail.com");

        UserRepository repository = new UserRepository();
        repository.save(user);
    }
}
