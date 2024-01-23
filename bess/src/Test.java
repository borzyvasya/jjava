public class Test {
    public static void main(String[] args) {
        User user1 = new User("Saske");
        User user2 = new User("Naruto");

        user1.sendMessage(user2, "NARUTOOOOOOO");
        user2.sendMessage(user1, "SAAASKEEEEEE");

        MessageDB.showDialog(user1, user2);
    }
}
