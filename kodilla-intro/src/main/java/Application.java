public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application adam = new Application("Adam", 40,190);

        if (adam.name != null) {
            if (adam.age > 30 && adam.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}