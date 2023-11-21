
/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej02 {

    public static void main(String[] args) {
        //Entorno:
        int[] numEntero;
        byte i;
        //Algoritmo:
        numEntero = new int[15];
        for (i = 0; i <= numEntero.length - 1; i++) {
            numEntero[i]=(int)(Math.random()*1000);
        }//Fin Para
        for(i=(byte) (numEntero.length-1);i>=0;i--){
            System.out.println(numEntero[i]);
        }//Fin Para
    }//Fin Programa
}
