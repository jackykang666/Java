package hw10;

public class ShapeTest {
    public static void main(String[] args) {
        ThreeDimensionalShape[] shapes = new ThreeDimensionalShape[] {
                new Sphere(3.0),
                new Cube(4.0),
                new Cylinder(2.0, 5.0),
                new Cone(4.0, 7.0)
        };

        for (ThreeDimensionalShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
