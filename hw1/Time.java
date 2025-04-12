public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hh, int mm, int ss) {
        this.hour = hh;
        this.minute = mm;
        this.second = ss;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hh) {
        if(hh >=0 && hh <= 24) this.hour = hh;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int mm) {
        if(mm >=0 && mm <= 60) this.minute = mm;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int ss) {
        if(ss >=0 && ss <= 60) this.second = ss;
    }

    public boolean isMorning() {
        return this.hour >= 6 && this.hour <= 10;
    }

    public boolean isAfternoon() {
        return this.hour >= 13 && this.hour <= 17;
    }

    public boolean isNoon() {
        return this.hour == 12;
    }

    public boolean isEvening() {
        return this.hour >= 18 && this.hour <= 23;
    }
}