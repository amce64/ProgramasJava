// fichero punto.java

import java.lang.Math.*;
class Punto {
  double x, y;
  void valorInicial(double vx,double vy){
    x=vx;
    y=vy;
  }
  double distancia(Punto q){
    double dx=x-q.x;
    double dy=y-q.y;
    return Math.sqrt(dx*dx+dy*dy);
  }
}
