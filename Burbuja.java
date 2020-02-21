/* Programa que recibe desde teclado un número indeterminado de números float,
   y los muestra ordenados en orden decreciente por pantalla
*/

import java.util.Scanner;

public class Burbuja{
  public static void ordena(float[] numeros){
    float temporal;
    for(int i=0;i<numeros.length-1;i++){
      for(int j=i+1;j<numeros.length;j++){
        if(numeros[j]>numeros[i]){
          temporal=numeros[j];
          numeros[j]=numeros[i];
          numeros[i]=temporal;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float[] numeros;
    try{
      System.out.print("¿Cuántos números vas a ordenadar? ");
      int totalNumeros=entrada.nextInt();
      numeros=new float[totalNumeros];
      for(int i=0;i<totalNumeros;i++){
        System.out.print("Valor " + (i+1) +": ");
        numeros[i]=entrada.nextFloat();
      }
      ordena(numeros);
      System.out.println("Los valores ordenados decrecientemente son: ");
      for(int i=0;i<totalNumeros;i++){
        System.out.println("Valor " + (i+1) +": "+ numeros[i]);
      }
    }catch(Exception e){
      System.out.println("Excepción: " + e.getMessage());
    }
  }
}
