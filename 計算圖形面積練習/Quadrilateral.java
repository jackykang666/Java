package 計算圖形面積練習;

public class Quadrilateral {
    private Point p1, p2, p3, p4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP1(Point p) {
        p1 = p;
    }

    public void setP2(Point p) {
        p2 = p;
    }

    public void setP3(Point p) {
        p3 = p;
    }

    public void setP4(Point p) {
        p4 = p;
    }

    public String toString() {
        return "Coordinates of Quadrilateral are:\n" + p1 + ", " + p2 + ", " + p3 + ", " + p4;
    }
}
