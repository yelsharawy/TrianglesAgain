public class Tester {

    public static void main(String[] args) {
        System.out.println("Point tests:");
        Point p1 = new Point(3, 4);
        System.out.print("p1.getX() -> ");
        System.out.println(p1.getX());  // 3.0
        System.out.print("p1.getY() -> ");
        System.out.println(p1.getY());  // 4.0
        Point p2 = new Point(p1);
        System.out.print("p2.getX() -> ");
        System.out.println(p2.getX());  // 3.0
        System.out.print("p2.getY() -> ");
        System.out.println(p2.getY());  // 4.0
        System.out.println();
    }

}
