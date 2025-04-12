import java.util.Date;

public class Booking {
    private Customer customer;
    private int numAdults;
    private int numKids;
    private Date bookingTime;

    public Booking(Customer customer, int numAdults, int numKids, Date bookingTime) {
        this.customer = customer;
        this.numAdults = numAdults;
        this.numKids = numKids;
        this.bookingTime = bookingTime;
    }

    public String toString() {
        return "Booking for " + customer + ", Adults: " + numAdults + ", Kids: " + numKids + ", Date: " + bookingTime;
    }
}
