/*Programa: Ejercicio16
 Autor: Sergio Izquierdo Moreno
 Entorno:
    num es numérico entero
    resto es numérico entero
    divisor es numérico entero
     i es numérico entero
 Algoritmo:
    Repetir 
        Escribir "Introduzca un número: "
        Leer num
    Hasta num>0
    Si num!=1 entonces
        Para i de 1 a num/2 hacer 
            resto<--num%i
            cociente<--num/i
            Si resto=0 entonces
                Escribir "El ",i," es divisor de ",num
                Escribir "El ",cociente," es divisor de ",num
            Sino
                Escribir "El ",i," no es divisor de ",num
            Fin Si            
        Fin Para
    Sino
    Escribir "El 0 es divisor de todos los números"
    Fin Si
 Fin Programa*/

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        //Entorno:
        int num, resto, cociente;
        short i;
        //Algoritmo:
        do {
            System.out.println("Introduzca un número: ");
            num = Leer.datoInt();
        } while (num < 0);
        if (num != 0) {
            for (i = 1; i <= (short) Math.sqrt(num); i++) {
                resto = num % i;
                cociente = num / i;
                if (resto == 0) {
                    System.out.println("El " + i + " es divisor de " + num);
                    System.out.println("El " + cociente + " es divisor de " + num);
                }//Fin Si              
            }//Fin Para           
        } else {
            System.out.println("El 0 es divisor de todos los números");
        }//Fin Si
    }//Fin Programa
}
