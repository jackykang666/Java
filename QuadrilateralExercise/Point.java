package QuadrilateralExercise;

public class Point {
    private double x;
    private double y;

    public Point(double xCoordinate, double yCoordinate) {
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}