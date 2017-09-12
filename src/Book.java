public class Book {
    String title;
    Integer numPages;
    String publisher;
    String Author;

    Integer currentPage;

    public Book(String title, Integer numPages, String publisher, String author) {
        this.title = title;
        this.numPages = numPages;
        this.publisher = publisher;
        Author = author;
        this.currentPage = 0;
    }

    public String printInfo() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numPages=" + numPages +
                ", publisher='" + publisher + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    public Integer readPages(Integer numPagesRead) {
        currentPage += numPagesRead;
        if( currentPage > numPages) {
            // we finished the book!
            System.out.println("You finished the book!");
            currentPage = 0;
        }

        return currentPage;
    }
}
