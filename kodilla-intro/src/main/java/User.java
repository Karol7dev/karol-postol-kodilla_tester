public class User {
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public double getAvgAge(User[] users) {
        double sum = 0;

        for (User user : users) {
            sum = sum + user.userAge;
        }
        return sum / users.length;
    }
}
