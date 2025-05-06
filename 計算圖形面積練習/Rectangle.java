package 計算圖形面積練習;

public class Rectangle extends Quadrilateral {
    public Rectangle(double x1, double y1, double width, double height) {
        super(x1, y1, x1 + width, y1, x1, y1 - height, x1 + width, y1 - height);
    }

    public double getWidth() {
        return getP2().getX() - getP1().getX();
    }

    public double getHeight() {
        return getP1().getY() - getP3().getY();
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public String toString() {
        return "Coordinates of Rectangle are:\n" + getP1() + ", " + getP2() + ", " + getP3() + ", " + getP4() + "\n" +
        "Width is" + getWidth() + "\n" +
        "Heigth is" + getHeight() + "\n" +
        "Area is" + getArea();
    }
}
