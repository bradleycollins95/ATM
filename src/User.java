/**
 * The User class represents a user with a username and password.
 */
public class User {

    private String username;
    private String password;

    /**
     * Constructs a User with the specified username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Constructs a User with default username and password.
     */
    public User() {
        this.username = "username123"; // default username
        this.password = "password";    // default password
    }

    /**
     * Returns the username of the user.
     *
     * @return the username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the new username of the user
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the password of the user.
     *
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the new password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Checks if the provided username and password match the user's credentials.
     *
     * @param username the username to check
     * @param password the password to check
     * @return true if the credentials match, false otherwise
     */
    public boolean isLoginCorrect(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

