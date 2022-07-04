public class BookShelf {


    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Лесков");
        Author author2 = new Author("Иван", "Ефремов");
        Author author3 = new Author("Николай", "Лесков");
        Book book1 = new Book("Очарованный странник", author1, 2014);
        Book book2 = new Book("Час быка", author2, 2021);
        Book book3 = new Book("Очарованный странник", author3, 2014);
        printBookProperties(book1);
        printBookProperties(book2);
        book2.setYearOfPublication(2014);

        printBookProperties(book2);
        System.out.println(book3.toString());
        System.out.println(author3.toString());
        System.out.println(book1.equals(book3));
    }


    public static void printBookProperties(Book book) {
        System.out.println(book.getBookTitle() + " " + book.getAuthor() + " " + book.getYearOfPublication());
    }
}