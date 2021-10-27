public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point p1, Point p2, Point p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }

    public double getPerimeter() {
        return Point.distance(v1, v2) + Point.distance(v1, v3) + Point.distance(v2, v3);
    }

    public Point getVertex(int val) {
        if (val == 1) {
            return v1;
        }
        if (val == 2) {
            return v2;
        }
        if (val == 3) {
            return v3;
        }
        return v1;
    }
    public void setVertex(int val, Point constant) {
        if (val == 1) {
            v1 = constant;
        }
        if (val == 2) {
            v2 = constant;
        }
        if (val == 3) {
            v3 = constant;
        }
    }

    public String toString() {
        return "{" +
            v1 + "," + v2 + "," + v3 +
            "}";
    }

    public static boolean closeEnough(double inp1, double inp2) {
        return (Math.abs((inp1 - inp2) / inp2) < 0.00001);
        // 0.001%
    }
    public boolean equals(Triangle tester) {
        return (v1.equals(tester.getVertex(1)) &&
            v2.equals(tester.getVertex(2)) &&
            v3.equals(tester.getVertex(3)));
    }

    public String classify() {
        double side0 = Point.distance(v1, v2);
        double side1 = Point.distance(v2, v3);
        double side2 = Point.distance(v3, v1);
        // save all sides of traingles to sides
        if (closeEnough(side0, side1) && closeEnough(side1, side2)) {
            // if all equal
            return "equilateral";
        }
        // if 2 equal
        else if (closeEnough(side0, side1) || closeEnough(side1, side2) || closeEnough(side0, side2)) {
            return "isosceles";
            // if none equal
        } else {
            return "scalene";
        }
    }

    public double area() {
        double halfPer = getPerimeter() * 0.5;
        double side0 = Point.distance(v1, v2); // put every side in a variable to Not repeat
        double side1 = Point.distance(v2, v3);
        double side2 = Point.distance(v3, v1);
        return Math.sqrt(halfPer * (halfPer - side0) * (halfPer - side1) * (halfPer - side2));
    }
}
