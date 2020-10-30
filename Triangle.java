public class Triangle {

  private Point v1, v2, v3;

  public static double round(double n, int place) {
    //rounds a number to a select place
    double answer = (int)(n * place + .5);
    return (double)answer / place;
  }

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point (x1,y1);
    v2 = new Point (x2,y2);
    v3 = new Point (x3, y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double s = getPerimeter()/2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double result =  Math.sqrt(s * (s-a) * (s-b) * (s-c));
    return round(result,10000);
  }

  public String classify() {
    double a = round(v1.distanceTo(v2),1000);
    double b = round(v2.distanceTo(v3),1000);
    double c = round(v3.distanceTo(v1),1000);
    if (a == b || b == c || a == c) {
        if (a == b && b == c) {
          return "equilateral";
        }
        return "isosceles";
      }
    return "scalene";
  }

  public String toString() {
    String ans = "v1(" + v1.getX() + ", " + v1.getY() + ") ";
    ans += "v2(" + v2.getX() + ", " + v2.getY() + ") ";
    ans += "v3(" + v3.getX() + ", " + v3.getY() + ")";
    return ans;
  }

}
