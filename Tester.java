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
    }

}
