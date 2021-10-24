public class Demo{
  public static double distance(Point p1, Point p2){
    double x1 = p1.getX();
    double y1 = p1.getY();
    double x2 = p2.getX();
    double y2 = p2.getY();
    return Math.sqrt(Math.pow(x1 -x2,2) + Math.pow(y2-y1,2));
  }

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(distance(P1,P2)); //call1
    System.out.println(Point.distance(P1,P2)); //call 2
    System.out.println(P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }

 }
