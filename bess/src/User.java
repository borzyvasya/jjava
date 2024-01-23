import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubcribed(User user) {
        for (User currentUser : subscriptions) {
            if (currentUser.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubcribed(user) && user.isSubcribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDB.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
