package hw10;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSurfaceArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String toString() {
        return String.format("Cube [Side: %.2f, Surface Area: %.2f, Volume: %2f]", side, getSurfaceArea(), getVolume());
    }
}
