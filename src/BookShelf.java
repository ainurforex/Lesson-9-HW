public class BookShelf {


    public static void main(String[] args) {
        Author author1=new Author("Николай","Лесков");
        Author author2=new Author("Иван","Ефремов");
        Book book1=new Book("Очарованный странник",author1,2014);
        Book book2=new Book("Час быка",author2,2021);
        printBookProperties(book1);
        printBookProperties(book2);
        book2.setYearOfPublication(2014);
        printBookProperties(book2);
    }

    public static void printBookProperties(Book book) {
        System.out.println(book.getBookTitle()+" "+book.getAuthor()+" "+book.getYearOfPublication());
    }
}