
/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej01 {

    public static void main(String[] args) {
        //Entorno:
        int[] numEntero;
        byte i;
        //Algoritmo:
        numEntero = new int[20];
        for (i = 0; i <= numEntero.length - 1; i++) {
            numEntero[i] = (int) (Math.random() * 1000);
            System.out.println(numEntero[i]);
        }//Fin Para
    }//Fin Programa
}
