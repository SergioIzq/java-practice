/*Programa: Ejercicio19
 Autor: Sergio Izquierdo Moreno
 Entorno:
    num es numérico entero
 Algoritmo:
    Repetir
        Escribir "Introduzca un número de un sólo dígito: "
        Leer num
    Hasta num>0 y num<10
    Según Sea num hacer
        1:
            Escribir "Uno"
        2:
            Escribir "Dos"
        3:
            Escribir "Tres"
        4:
            Escribir "Cuatro"
        5:  
            Escribir "Cinco"
        6:
            Escribir "Seis"
        7:
            Escribir "Siete"
        8:
            Escribir "Ocho"
    Sino                
        Escribir "Nueve"
    Fin Según Sea
 Fin Programa*/

public class Ejercicio19 {

    public static void main(String[] args) {
        //Entorno:
        byte numByte;
        short numShort;
        //Algoritmo:
        do {
            System.out.println("Introduzca un número de un sólo dígito: ");
            numShort = Leer.datoShort();
            numByte = (byte) numShort;
        } while (numByte < 1 || numByte > 9);
        switch (numByte) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            default:
                System.out.println("Nueve");
        }//Fin Según Sea
    }//Fin Programa
}
