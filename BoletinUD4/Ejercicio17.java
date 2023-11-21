/*Programa: Ejercicio17
Autor: Sergio IZquierdo Moreno
Entorno:
    num es numérico real
    suma es numérico real
    sumandos es numérico entero
Algoritmo:
    Escribir "Introduzca un número: "
    Leer num
    suma<--num
    Si num!=0 entonces
        sumandos++
    Fin Si
    Mientras num!=0
        Escribir "Introduzca otro número: "
        Leer num
        suma<--suma+num
        Si num!=0 entonces
            sumandos++
        Fin Si
    Fin Mientras
    Escribir "Ha introducido ",sumandos," sumando(s), y su suma es ",suma
Fin Programa*/
/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        //Entorno:
        float suma,num;
        byte sumandos;
        //Algoritmo:
        sumandos = 0;
        System.out.println("Introduzca un número: ");
        num = Leer.datoFloat();
        suma = num;
        if (num != 0) {
            sumandos++;
        }//Fin Si        
        while (num != 0) {
            System.out.println("Introduzca otro número: ");
            num = Leer.datoFloat();
            suma = suma + num;
            if (num != 0) {
                sumandos++;
            }//Fin Si                
        }//Fin Mientras
        System.out.println("Ha introducido " + sumandos + " sumando(s), y su "
                + "suma es " + suma);
    }//Fin Programa
}
