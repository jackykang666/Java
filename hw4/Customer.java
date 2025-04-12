public class Customer {
    private String surname;
    private Title title;
    private String phone;

    public Customer(String surname, Title title, String phone) {
        this.surname = surname;
        this.title = title;
        this.phone = phone;
    }

    public String toString() {
        return title + " " + surname + " (Phone: " + phone + ")";
    }
}
