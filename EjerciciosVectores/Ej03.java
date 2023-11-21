/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ej03 {
    public static void main(String[] args){
    //Entorno:
     int num;
     byte posicion,i;
     int numMax;     
    //Algoritmo:
        System.out.println("Introduzca el 1 número entero: ");
        numMax=Leer.datoInt();
        posicion=1;
        for(i=2;i<=50;i++){
            System.out.println("Introduzca el "+i+" número entero");
            num=Leer.datoInt();
            if(num>numMax){
                numMax=num;
                posicion=i;
            }//Fin Si            
        }//Fin Para 
        System.out.println("El mayor número introducido ha sido el "+numMax+" en la posición "+posicion);
    }//Fin Programa
}
