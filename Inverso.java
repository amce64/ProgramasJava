/* Recibe por teclado un conjunto de N números enteros, y los muestra por pantall
   en orden inverso a su introducción. */

// El programa usa la clase Scanner para realizar la entrada por teclado.

import java.util.Scanner;

public class Inverso {
  public static void main(String[] args) {
    // Crea objeto Scanner para obtener la entrada de la ventana de comandos.
    Scanner entrada = new Scanner(System.in);
    int[] numeros;
    try{
      System.out.print("Introduce el número N: ");
      int N=entrada.nextInt();
      numeros = new int[N];
      for(int i=0;i<N;i++){
        System.out.print("Numero "+ (i+1) + "-> ");
        numeros[i]=entrada.nextInt();
      }
      System.out.println("Los números al reves son: ");
      for(int i=N-1;i>=0;i--){
        System.out.println(numeros[i]);
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
