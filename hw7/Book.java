public class Book {
    private String bookName;
    private String isbn;
    private Author[] authors;
    private Publisher publisher;
    private Date publishingDate;

    public Book(String bookName, String isbn, Author[] authors, Publisher publisher, Date publishingDate) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingDate = publishingDate;
    }

    public String getBookName() { return bookName; }
    public String getIsbn() { return isbn; }
    public Author[] getAuthors() { return authors; }
    public Publisher getPublisher() { return publisher; }
    public Date getPublishingDate() { return publishingDate; }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author).append(", ");
        }
        if (authorsStr.length() > 0) {
            authorsStr.setLength(authorsStr.length() - 2); 
        }

        return "Book{" +
                "BookName='" + bookName + '\'' +
                ", Isbn='" + isbn + '\'' +
                ", Authors=[" + authorsStr + "]" +
                ", Publisher=" + publisher +
                ", PublishingDate=" + publishingDate +
                '}';
    }
}