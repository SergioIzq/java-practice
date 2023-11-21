/*Programa: Ejercicio26
Autor: Sergio Izquierdo Moreno
Entorno:
    num es numérico entero
    i es numérico entero
Algoritmo:
    Repetir 
        Escribir "Introduzca un número (1-100): "
        Leer num
    Hasta num>=1 o num<=100
    Para i de 0 a num con incremento i+2
        Escribir i
    Fin Para
Fin Programa*/

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio26 {
    public static void main(String[] args){
    //Entorno:
        byte numByte,i;
        short numShort;
    //Algoritmo:
        do{
            System.out.println("Introduzca un número (1-100): ");
            numShort=Leer.datoShort(); 
            if(numShort<-128 || numShort>127){
                System.out.println("Dato inválido teclee otro: ");
            }//Fin Si
        }while(numShort<1 || numShort>100 && numShort<-128 || numShort>127);
        numByte=(byte)numShort;
        for(i=0;i<numByte;i=(byte)(i+2)){
            System.out.println(i);        
        }//Fin Para
    }//Fin Programa
}
