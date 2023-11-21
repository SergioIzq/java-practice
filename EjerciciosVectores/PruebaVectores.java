/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class PruebaVectores {
    public static void main(String[] args) {
        //Entorno:
        int[] numEntero;
        byte i;
        int acum;
        //Algoritmo:
        acum=0;
        numEntero=new int[20];
        for(i=0;i<=20-1;i++){            
            numEntero[i]=i+1;    
            System.out.println(numEntero[i]);
        }//Fin Para
    }//Fin Programa
}
