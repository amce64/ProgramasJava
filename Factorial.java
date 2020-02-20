/* Aplicación que me permite recibir por teclado un número dentro del rango 1-10
   y me deberá mostrar el factorial de ese número. El factorial se define de la
   siguiente forma:
      * Factorial(1)=1.
      * Factorial(n)=(n-1)*n.
*/

import java.util.Scanner;

public class Factorial{ // método recursivo.
  public static int factorial(int n){
    if(n==1){
      return 1;
    }else{
      return factorial(n-1)*n;
    }
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    try{
      System.out.print("Introduce el número N: ");
      int numero = entrada.nextInt();
      if(numero >= 1 && numero <=10){
        System.out.println("El factorial de N es: " + factorial(numero));
      }else{
        System.out.println("El número N no está en el rango 1-10.");
      }
    }catch (Exception e){
      System.out.println("Excepción: " + e.getMessage());
    }
  }
}
