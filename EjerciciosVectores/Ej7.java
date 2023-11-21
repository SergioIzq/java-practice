/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej7 {
    public static void main(String[] args) {
        //Entorno:
        int[] numEntero;
        byte i;
        //Algoritmo:
        numEntero = new int[50];
        for (i = 0; i <= numEntero.length - 1; i++) {
            System.out.println("Introduzca el "+i+" número entero");
            numEntero[i]=Leer.datoInt();
        }//Fin Para
        for(i=(byte) (numEntero.length-1);i>=0;i--){
            System.out.println(numEntero[i]);
        }//Fin Para
    }//Fin Programa
}
