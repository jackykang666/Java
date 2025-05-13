package hw10;

public class Cone extends ThreeDimensionalShape {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant);
    }

    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public String toString() {
        return String.format("Cone [Radius: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f]", radius, height, getSurfaceArea(), getVolume());
    }
}