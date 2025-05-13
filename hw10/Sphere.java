package hw10;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return String.format("Sphere [Radius: %.2f, Surface Area: %.2f, Volume: %.2f]",
                              radius, getSurfaceArea(), getVolume());
    }
}

