import java.lang.Math.*;
class Punto{
  double x,y;
  Punto(double x, double y){
    this.x=x;
    this.y=y;
  }
  double distancia(Punto q){
    double dx=x-q.x;
    double dy=y-q.y;
    return Math.sqrt(dx*dx+dy*dy);
  }
  double distancia(double cx, double cy){
    double dx=x-cx;
    double dy=y-cy;
    return Math.sqrt(dx*dx+dy*dy);
  }
}
