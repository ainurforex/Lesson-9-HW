public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublication;
    public Book(String bookTitle,Author author,int yearOfPublication) {
        this.bookTitle=bookTitle;
        this.author=author;
        this.yearOfPublication=yearOfPublication;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthor() {
        return this.author.getNameOfAuthor()+" "+this.author.getFamilyOfAuthor();
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public int setYearOfPublication(int yearOfPublication) {
        return this.yearOfPublication=yearOfPublication;
    }
}
