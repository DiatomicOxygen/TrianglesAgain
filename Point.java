public class Point{

  private double x, y;

  public Point(double nx, double ny){
    x = nx;
    y = ny;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public Point copy(){
    return new Point(x,y);
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  //2.3 a method
  public double distanceTo(Point other) {
    return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
  }

  //2.3 b method
  public boolean equals(Point other) {
    return (x == other.x && y == other.y);
  }
}
