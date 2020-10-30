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
}
