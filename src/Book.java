public class Book {
    String title;
    Integer numPages;
    String publisher;
    String Author;

    public Book(String title, Integer numPages, String publisher, String author) {
        this.title = title;
        this.numPages = numPages;
        this.publisher = publisher;
        Author = author;
    }

    public String printInfo() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numPages=" + numPages +
                ", publisher='" + publisher + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
