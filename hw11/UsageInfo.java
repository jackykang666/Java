package hw11;

public class UsageInfo {
    String tech;
    int year;
    int month;
    String company;
    long users;
    double totalMinutes;
    double avgMinutes;

    public UsageInfo(String tech, String yearMonth, String company, double totalMinutes, long users, double avgMinutes) {
        this.tech = tech;
        String[] ym = yearMonth.split("/");
        this.year = Integer.parseInt(ym[0]);
        this.month = Integer.parseInt(ym[1]);
        this.company = company;
        this.totalMinutes = totalMinutes;
        this.users = users;
        this.avgMinutes = avgMinutes;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public long getUsers() { return users; }

    public String toString() {
        return String.format("%d/%02d | %s | %s | Users: %,d | Total Minutes: %.2f | Average Minutes: %.2f",
                year, month, tech, company, users, totalMinutes, avgMinutes);
    }
}

