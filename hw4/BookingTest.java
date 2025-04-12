import java.util.Date;

public class BookingTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Chen", Title.MR, "0912345678");
        
        Booking booking1 = new Booking(customer1, 4, 2, new Date());
        
        System.out.println("Booking Information:");
        System.out.println(booking1);
    }
}