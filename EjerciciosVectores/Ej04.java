/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej04 {
    public static void main(String[] args){
    //Entorno:
     int num;
     byte posicion,i;
     int numMin;     
    //Algoritmo:
        System.out.println("Introduzca el 1 número entero: ");
        numMin=Leer.datoInt();
        posicion=1;
        for(i=2;i<=50;i++){
            System.out.println("Introduzca el "+i+" número entero");
            num=Leer.datoInt();
            if(num<=numMin){
                numMin=num;
                posicion=i;
            }//Fin Si            
        }//Fin Para 
        System.out.println("El menor número introducido ha sido el "+numMin+" en la posición "+posicion);
    }//Fin Programa
}
