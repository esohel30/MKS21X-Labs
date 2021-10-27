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

    public static boolean closeEnough(double x, double y){
      return ((x-y)/x < 0.001);
        }

    public boolean equals(Triangle test){
      if ((test.getX()==0.0 && test.getY() != 0.0) || (test.getX()!=0.0 && test.getY() == 0.0)){
        return false;
      }
    return closeEnough(test.getX(), test.getY());
    }   
}
