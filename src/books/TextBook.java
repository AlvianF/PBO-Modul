package books;

public class TextBook extends Book {

    String category = "Text";

    public TextBook(String bookId, String title, String author, int stock) {
        super(bookId, title, author, stock);
        setCategory(category);
    }
}
