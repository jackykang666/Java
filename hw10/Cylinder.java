package hw10;

public class Cylinder extends ThreeDimensionalShape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return String.format("Cylinder [Radius: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f]", radius, height, getSurfaceArea(), getVolume());
    }
}
