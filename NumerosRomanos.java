/* Programa que recibe por teclado un número entre 1 y 3999, y lo convierte
   en números romanos */

import java.util.Scanner;

public class NumerosRomanos{
  public static String pasoRomano(int numero) {
    String[] romanos={"I","IV","V","IX","XL","L","XC","C","CD","D","CM","M"};
    int[] numeros={1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String temporal="";
    for(int i=romanos.length-1; i>=0;i--){
      for(int j=1;j<=(numero/numeros[i]);j++){
        temporal+=romanos[i];
        numero%=numeros[i];
      }
    }
    return temporal;
  }
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int decimal;
    try{
      System.out.print("Escribe el núermo a convertir en romano: ");
      decimal=entrada.nextInt();
      System.out.println("El número en romano es "+pasoRomano(decimal));
    }catch(Exception e){
      System.out.println("Excepción: "+e.getMessage());
    }
  }
}
