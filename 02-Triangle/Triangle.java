public class Traingle {
    private point v1, v2, v3;

    public Triangle(point p1, point p2, point p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }

    public double getPerimeter() {
        return Point.distance(v3, v1) + Point.distance(v2, v3) + Point.distance(v1, v2);
    }

    public point getVertex(int val) {
        if (val == 1) {
            return v1;
        }
        if (val == 2) {
            return v2;
        }
        if (val == 3) {
            return v3;
        }
    }
    public void setVertex(int val, Point constant) {
        if (val = 1) {
            v1 = constant;
        }
        if (val == 2) {
            v2 = constant;
        }
        if (val == 3) {
            v2 = constant;
        }
    }

    public String toString() {
        return "[" +
            v1 + "," + v2 + "," + v3 +
            "]"
    }
}
