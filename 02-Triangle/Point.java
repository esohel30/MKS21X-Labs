public class Point {
    private double x, y;
    public Point(double X, double Y) {
        x = X;
        y = Y;
    }
    public Point(Point p) {
        x = p.x;
        y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static double distance(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
    }
    public double distanceTo(Point p2) {
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x1 = x;
        double y1 = y;
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
    }
    public String toString() {
        return "{" +
            x + "," + y + "}";
    }

    public static boolean closeEnough(double input1, double input2) {
        if (input1 == 0 || input2 == 0) {
            if ((input1 == 0 && input2 != 0) || (input2 == 0 && input2 != 0)) {
                return false;
            }
             else {
                return true;
            }
        }
        return (Math.abs((input1 - input2) / input2) < 0.001);
    }

    public boolean equals(Point test) {
        if(test == null){
          return false;
        }
        return (closeEnough(x, test.getX()) && closeEnough(y, test.getY()));
    }



}
