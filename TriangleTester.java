public class TriangleTester {
  public static void main(String[] args) {
    //Test for 2.2
    Point a = new Point(0, 3);
    Point b = new Point(0, 0);
    Point c = new Point(4,0);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(b.getX());
    System.out.println(b.getY());

    //Test for 2.3 a
    System.out.println(a.distanceTo(b));
    System.out.println(b.distanceTo(a));

    //Test for 2.3 b
    System.out.println(a.equals(c));
    System.out.println(b.equals(c));
    System.out.println(c.equals(c));

    //Tests for Triangle class
    Triangle ABC = new Triangle(a,b,c);
    Triangle DEF = new Triangle(1,2,3,4,5,6);

    //Tests for 2.4 c
    System.out.println(ABC.getPerimeter());
    System.out.println(DEF.getPerimeter());

    System.out.println(ABC.getArea());
    System.out.println(DEF.getArea());

    Triangle XYZ = new Triangle(0,0,4,0,2,5);
    Triangle GHI = new Triangle(0,0,2,0,1,1*Math.sqrt(3));
    System.out.println(ABC.classify());
    System.out.println(XYZ.classify());
    System.out.println(GHI.classify());

    System.out.println(ABC);
    System.out.println(DEF);
    System.out.println(XYZ);

    XYZ.setVertex(0, a);
    System.out.println(XYZ);
    XYZ.setVertex(1, a);
    System.out.println(XYZ);
    XYZ.setVertex(2, a);
    System.out.println(XYZ);
  }
}
