public class Triangle {

    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    public void setVertex(int index, Point newP) {
        switch (index) {
            case 0:
                v1 = newP;
                break;
            case 1:
                v2 = newP;
                break;
            case 2:
                v3 = newP;
                break;
            default:
                System.out.println("Invalid index given for setVertex!");
        }
    }

    public double getPerimeter() {
        double a = v2.distanceTo(v3);
        double b = v3.distanceTo(v1);
        double c = v1.distanceTo(v2);
        return a + b + c;
    }

    public double getArea() {
        double a = v2.distanceTo(v3);
        double b = v3.distanceTo(v1);
        double c = v1.distanceTo(v2);
        double S = getPerimeter() / 2;
        return Math.sqrt(S * (S-a) * (S-b) * (S-c));
    }

    public static final double ROUND_PRECISION = 1e4;

    private static double round(double x) {
        return Math.round(x * ROUND_PRECISION) / ROUND_PRECISION;
    }

    public String classify() {
        double a = round(v2.distanceTo(v3));
        double b = round(v3.distanceTo(v1));
        double c = round(v1.distanceTo(v2));
        if (a == b) {
            if (a == c) {
                return "equilateral";
            }
            return "isosceles";
        } else if (a == c || b == c) {
            return "isosceles";
        }
        return "scalene";
    }

    public String toString() {
        return "v1" + v1 + " v2" + v2 + " v3" + v3;
    }
}
