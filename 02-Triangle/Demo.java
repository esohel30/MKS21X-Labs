public class Demo {

    public static double distance(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Point P1 = new Point(1, 1);
        Point P2 = new Point(2, 2);
        Point P3 = new Point(4, 4);
        Point P4 = new Point(-2, 10202);
        Point P5 = new Point(-2.001, 4.002);
        Point P6 = new Point(-2, 4);

        System.out.println(distance(P1, P2)); //call1
        System.out.println(Point.distance(P1, P2)); //call 2
        System.out.println(P1.distanceTo(P2)); //call 3
        // test cases
        System.out.println(distance(P1, P4));
        //  should return 10201.00
        System.out.println(Point.distance(P3, P4));
        //  should return 10198.001
        System.out.println(P2.distanceTo(P2));
        //  should return 0

        System.out.println("testing triangle methods");
        Triangle testTriangle1 = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
// should return 12.0 3/4/5 pythagorean triplet

        System.out.println(testTriangle1);
        System.out.println(testTriangle1.getPerimeter());
        Triangle testTriangle2 = new Triangle(new Point(1, 1), new Point(6, 1), new Point(1, 13));
// Should return 30 5/12/13 pythagorean triplet
        System.out.println(testTriangle2);
        System.out.println(testTriangle2.getPerimeter());

        Triangle testTriangle3 = new Triangle(new Point(2312, 22), new Point(123123, 223), new Point(2323, 222));
// Should return 241811.469  verified by online triangle perimeter calculator app
        System.out.println(testTriangle3);
        System.out.println(testTriangle3.getPerimeter());

        testTriangle3.setVertex(1, new Point(1, 1));
        System.out.println(testTriangle3);
        System.out.println(testTriangle3.getPerimeter());
// should return 2456254.69 verfied by same online calculator website

        System.out.println(P1.equals(P6));
        //should return false
        System.out.println(P2.equals(P2));
        //should return true
        System.out.println(P3.equals(P3));
        //should return true
        System.out.println(P6.equals(P5));
        //should return true





    }

  }
