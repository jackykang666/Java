package hw10;

public class ShapeTest {
    public static void main(String[] args) {
        ThreeDimensionalShape[] shapes = new ThreeDimensionalShape[2];
        shapes[0] = new Sphere(3.0);
        shapes[1] = new Cube(4.0);

        for (ThreeDimensionalShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
