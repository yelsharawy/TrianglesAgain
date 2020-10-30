public class Tester {

    public static void main(String[] args) {
        System.out.println("Point tests:");
        Point p1 = new Point(3, 4);
        System.out.print("p1 -> ");
        System.out.println(p1);  // (3.0, 4.0)
        Point p2 = new Point(p1);
        System.out.print("p2 -> ");
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
        new Triangle(p1, p2, new Point(3, 0));
        new Triangle(0, 0, 3, 4, 3, 0);
    }

}
