/*Programa: Ejercicio18
Autor: Sergio Izquierdo Moreno
Entorno:
    media es numérico real
    num es numérico real
    numIntroducidos es numérico entero
Algoritmo:
    Escribir "Introduzca un número: "
    Leer num
    Si num>-1 entonces
        media<--num
        numIntroducidos++
    Fin Si
    Mientras num>-1 
        Escribir "Introduzca otro número: "
        Leer num
        Si num>-1 entonces
            media<--media+num;
            numIntroducidos++
        Fin Si
    Fin Mientras
    media<--media/numIntroducidos
    Si numIntroducidos>0 entonces
        Escribir "La media de los números introducidos es ",media
    Sino
        Escribir "No se ha introducido ningún número"
    Fin Si
Fin Programa*/


/**
 *
 * @author Sergio Izquierdo Moreno
 */


public class Ejercicio18 {

    public static void main(String[] args) {
        //Entorno:
        float media, num;
        byte numIntroducidos;
        //Algoritmo:
        media = 0;
        numIntroducidos = 0;
        System.out.println("Introduzca un número: ");
        num = Leer.datoFloat();
        if (num > -1) {
            media = num;
            numIntroducidos++;
        }//Fin Si    
        while (num > -1) {
            System.out.println("Introduzca otro número: ");
            num = Leer.datoFloat();
            if (num > -1) {
                media = media + num;
                numIntroducidos++;
            }//Fin Si
        }//Fin Mientras
        media = media / numIntroducidos;
        if (numIntroducidos > 0) {
            System.out.println("La media de los números introducidos es " + media);
        } else {
            System.out.println("No se ha introducido ningún número");
        }//Fin Si
    }//Fin Programa 
}
