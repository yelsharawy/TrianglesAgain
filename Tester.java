public class Tester {

    public static void main(String[] args) {
        System.out.println("Point tests:");
        System.out.print("p1 -> ");
        Point p1 = new Point(3, 4);
        System.out.println(p1);  // (3.0, 4.0)
        System.out.print("p2 -> ");
        Point p2 = new Point(p1);
        System.out.println(p2);  // (3.0, 4.0)
        System.out.println();

        System.out.print("p1.equals(p2) -> ");
        System.out.println(p1.equals(p2));  // true
        System.out.print("p2.equals(p1) -> ");
        System.out.println(p2.equals(p1));  // true
        p1 = new Point(0, 0);
        System.out.print("p1.equals(p2) -> ");
        System.out.println(p1.equals(p2));  // false
        System.out.print("p2.equals(p1) -> ");
        System.out.println(p2.equals(p1));  // false
        System.out.println();

        System.out.print("p1.distanceTo(p2) -> ");
        System.out.println(p1.distanceTo(p2));  // 5.0
        System.out.print("p2.distanceTo(p1) -> ");
        System.out.println(p2.distanceTo(p1));  // 5.0
        System.out.println();

        System.out.println();

        System.out.println("Triangle tests:");
        System.out.print("t1 -> ");
        Triangle t1 = new Triangle(p1, p2, new Point(3, 0));
        System.out.println(t1);  // v1(0.0, 0.0) v2(3.0, 4.0) v3(3.0, 0.0)
        System.out.print("t2 -> ");
        Triangle t2 = new Triangle(0, 0, 3, 4, 0, 4);
        System.out.println(t2);  // v1(0.0, 0.0) v2(3.0, 4.0) v3(0.0, 4.0)
        System.out.println();
        System.out.print("t1.getPerimeter() -> ");
        System.out.println(t1.getPerimeter());  // 12.0
        System.out.print("t2.getPerimeter() -> ");
        System.out.println(t2.getPerimeter());  // 12.0
        System.out.println();
        System.out.print("t1.getArea() -> ");
        System.out.println(t1.getArea());  // 6.0
        System.out.print("t2.getArea() -> ");
        System.out.println(t2.getArea());  // 6.0
        System.out.println();  // good time to mention these are not thorough...
        System.out.print("t1.classify() -> ");
        System.out.println(t1.classify());  // scalene
        System.out.print("t2.classify() -> ");
        System.out.println(t2.classify());  // scalene
    }

}
