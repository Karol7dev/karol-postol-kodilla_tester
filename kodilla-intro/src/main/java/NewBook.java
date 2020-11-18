public class NewBook {
    private String author;
    private String title;

    private NewBook(String author, String title) {
        this.author = author;
        this.title = title;
    }



    public static NewBook of(String author, String title) {
        return new NewBook(author, title);
    }
}
