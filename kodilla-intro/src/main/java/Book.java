public class Book {
    String author;
    String title;

    public static void main(String[] args) {
        Book book = new Book();
        book.author = "J.R.R Tolkien";
        book.title = "Lord of The Ring";
        System.out.println(getBookData(book));

        NewBook.of("Mickiewicz", "Pan Tadeusz");
    }

    public static String getBookData(Book book) {
        return book.author + " " + book.title;
    }
}







