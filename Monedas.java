/* Programa que dado el un valor nos da el mejor cambio en monedas */

import java.util.Scanner;

public class Monedas{
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int[] monedas={500,200,100,50,20,10,5,2,1};
    int[] cambio=new int[9];
    int cantidad;
    try{
      System.out.print("Introduce la cantidad a cambiar: ");
      cantidad=entrada.nextInt();
      for(int i=0;i<monedas.length;i++){
        cambio[i]=cantidad/monedas[i];
        cantidad%=monedas[i];
      }
      System.out.println("El cambio es:");
      for(int i=0;i<monedas.length;i++){
        System.out.println("Monedas de "+monedas[i]+"="+cambio[i]);
      }
    }catch (Exception e){
      System.out.println("Excepción: "+e.getMessage());
    }
  }
}
