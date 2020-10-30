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

    public String toString() {
        return "v1" + v1 + " v2" + v2 + " v3" + v3;
    }
}
