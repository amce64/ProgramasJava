/* Programa que permite recibir por teclado dos números, uno es la base y otro
   la potencia. El programa devuelve el resultado de elevar la base a la potencia
*/

import java.util.Scanner;

public class Potencia{
  public static float potencia(int base, int exponente){
    float pot=1;
    boolean negativo=false;
    if(exponente<0){
      negativo=true;
      exponente*=-1;
    }
    for(int i=0;i<exponente;i++){
      pot*=base;
    }
    if(negativo){
      pot=1/pot;
    }
    return pot;
    }
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      try{
        System.out.print("Introduce base: ");
        int base=entrada.nextInt();
        System.out.print("Introduce exponente: ");
        int exponente=entrada.nextInt();
        System.out.println("La pontencia es: " + potencia(base,exponente));
      }catch (Exception e){
        System.out.println("Excepción: " + e.getMessage());
      }
    }
}
