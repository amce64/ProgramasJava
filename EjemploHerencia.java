// Definición de la clase abstracta Figura
abstract class Figura{
  abstract double perimetro();
  abstract double area();
}

// Definición de la clase Cuadrado que hereda de Figura
class Cuadrado extends Figura{
  double lado;
  Cuadrado(double l){
    lado=l;
  }
  double perimetro(){
    return lado*4;
  }
  double area(){
    return lado*lado;
  }
}

// Definición de la clase Circulo que hereda de Figura
class Circulo extends Figura{
  double radio;
  Circulo(double r){
    radio=r;
  }
  double perimetro(){
    return 2*Math.PI*radio;
  }
  double area(){
    return Math.PI*radio*radio;
  }
}

// Definición de la clase principal
class EjemploHerencia{
  public static void main(String[] args) {
    Figura [] f=new Figura[2];
    f[0]=new Cuadrado(2);
    f[1]=new Circulo(7);
    for(int i=0;i<2;i++){
      System.out.println("Figura "+i);
      System.out.println("\t"+f[i].perimetro());
      System.out.println("\t"+f[i].area());
    }
  }
}
