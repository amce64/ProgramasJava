class UsoPunto{
  public static void main(String[] args) {
    Punto p, q;
    double d;
    p=new Punto(5,4);
    q=new Punto(2,2);
    d=p.distancia(q);
    System.out.println("Distancia: "+d);
  }
}
