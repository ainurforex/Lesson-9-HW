import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublication;

    public Book(String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {

        return this.bookTitle;
    }

    public String getAuthor() {

        return this.author.getNameOfAuthor() + " " + this.author.getFamilyOfAuthor();
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public int setYearOfPublication(int yearOfPublication) {

        return this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + bookTitle + ". " + author +
                " Год Издания " + yearOfPublication +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && getBookTitle().equals(book.getBookTitle()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookTitle(), getAuthor(), getYearOfPublication());
    }
}
