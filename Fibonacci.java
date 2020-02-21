/* Sabiendo que la sucesión de Fibonacci se define de la siguiente forma:
    * Fibonacci(0)=0
    * Fibonacci(1)=1;
    * Fibonacci(n)=Fibonacci(n-1)+Fibonacci(n-2);
   Este programa recibe un número entero, y devuelve su Fibonacci.
   Se implementa dos funciones una recursiva y otra iterativa.
*/

import java.util.Scanner;

public class Fibonacci{
  public static int Fibonacci_recursivo(int numero){
    if(numero==0){
      return 0;
    }else if(numero==1){
      return 1;
    }else if(numero==2){
      return 1;
    }else{
      return Fibonacci_recursivo(numero-1)+Fibonacci_recursivo(numero-2);
    }
  }
  public static int Fibonacci_iterativo(int numero){
    int fibo=0;
    int fibo1=0;
    int fibo2=1;

    for(int i=1;i<=numero;i++){
      fibo=fibo1+fibo2;
      fibo2=fibo1;
      fibo1=fibo;
    }
    return fibo;
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    try{
      System.out.print("Introduce el número: ");
      numero=entrada.nextInt();
      if(numero>=0){
        System.out.println("Fibonacci recusivo: "+Fibonacci_recursivo(numero));
        System.out.println("Fibonacci iterativo: "+Fibonacci_iterativo(numero));
      }else{
        System.out.println("No existe el Fibonacci de un número negativo");
      }
    }catch(Exception e){
      System.out.println("Exception: "+e.getMessage());
    }
  }
}
