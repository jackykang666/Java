public class BookTest {
    public static void main(String[] args) {
        // 建立第一個Book物件
        Author[] authors1 = {
                new Author("J.K.", "Rowling"),
                new Author("Stephen", "King")
        };
        Publisher publisher1 = new Publisher("Bloomsbury", "London, UK");
        Date date1 = new Date(1997, 06, 26);
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "978-0747532743", authors1, publisher1, date1);

        // 建立第二個Book物件
        Author[] authors2 = {
                new Author("Harper", "Lee")
        };
        Publisher publisher2 = new Publisher("J. B. Lippincott & Co.", "Philadelphia, USA");
        Date date2 = new Date(1960, 07, 11);
        Book book2 = new Book("To Kill a Mockingbird", "978-0446310789", authors2, publisher2, date2);

        // 印出Book物件的內容
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println("\nBook 2:");
        System.out.println(book2);
    }
}