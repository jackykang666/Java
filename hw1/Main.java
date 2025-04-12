class Main {
    public static void main(String args[]) {
        Time time1, time2, time3, time4;
        time1 = new Time(9, 50, 20);
        time2 = new Time(15, 30, 40);
        time3 = new Time(12, 0, 0);
        time4 = new Time(20, 25, 10);
        time1.setHour(20);
        time2.setHour(10);
        time3.setHour(40);
        time4.setHour(16);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
        System.out.println(time4.toString());
        time2.setHour(9);
        System.out.println("time2 is morning? " + time2.isMorning());
        time4.setHour(11);
        System.out.println("time4 is noon? " + time2.isNoon());
    }
}