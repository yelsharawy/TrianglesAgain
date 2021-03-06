public class Point {

    private double x, y;

    public Point(double X, double Y) {
        x = X;
        y = Y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceTo(Point other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Point && equals((Point)other);
    }

    @Override
    public int hashCode() {  // the linter was bothering me about it...
        return 31 * Double.hashCode(x) + Double.hashCode(y);
    }

    public boolean equals(Point other) {
        return other != null && x == other.x && y == other.y;
    }

}
