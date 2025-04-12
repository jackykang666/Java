public class Vector {
    public static void main(String[] args) {
        double x[] = {1.0, 2.0, 3.0};
        double y[] = {4.0, 5.0, 6.0};
        System.out.println("Inner Product: " + innerProduct(x, y));
        System.out.println("Norm of x: " + norm2(x));
        System.out.println("Norm of y: " + norm2(y));
        System.out.println("Cosine: " + cosine(x, y));
        System.out.println("Angle Between Vectors: " + angleBetweenVectors(x, y));
    }

    // 計算內積
    static double innerProduct(double x[], double y[]) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    // 計算範數(Norm)
    static double norm2(double x[]) {
        double sum = 0;
        for (double value : x) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }

    // 計算Cosine的值
    static double cosine(double x[], double y[]) {
        double dotProduct = innerProduct(x, y);
        double normX = norm2(x);
        double normY = norm2(y);
        return dotProduct / (normX * normY);
    }

    // 計算夾角值
    static double angleBetweenVectors(double x[], double y[]) {
        double cosTheta = cosine(x, y);
        return Math.toDegrees(Math.acos(cosTheta));
    }
}