Programa: Ejercicio27
Autor: Sergio Izquierdo Moreno
Entorno:

Algoritmo:


Fin Programa

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio27 {
    public static void main(String[] args){
    //Entorno:
        float num1,num2,i;        
    //Algoritmo:
        System.out.println("Introduzca el primer número: ");
        num1=Leer.datoInt();
        System.out.println("Introduzca el segundo número: ");
        num2=Leer.datoInt();
        for(i=num1;i<=num2;i++){
            if(i%1==0 & i%i==0){
                System.out.println(i+" es primo.");
            }//Fin Si
        }//Fin Para
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }//Fin Programa
}
