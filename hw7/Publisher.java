public class Publisher {
    private String corp;
    private String address;

    public Publisher(String corp, String address) {
        this.corp = corp;
        this.address = address;
    }

    public String getCorp() { return corp; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return corp + " (" + address + ")";
    }
}