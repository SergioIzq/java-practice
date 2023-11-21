/*Programa: Ejercicio13
Autor: Sergio Izquierdo Moreno
Entorno:
    opcion es alfanumérico (1)
    PI es CONST<--3.1416
    radio es numérico real 
Algoritmo:
    Repetir 
        Escribir "A. Longitud de circunferencia."
        Escribir "B. Superficie de la circunferencia."
        Escribir "C. Volumen de la esfera."
        Escribir "D. Área de la esfera."
        Escribir "E. Salir."
        Escribir "Elija opción: "
        Leer opcion
    Hasta opcion='A' o opcion='a' o opcion='B' o opcion='b' o opcion='C' o opcion='c' o opcion='D' o opcion='d' o opcion='E' o opcion='e'
    Si opcion!='E' y opcion!='e' entonces
        Escribir "Introduzca el radio de la circunferencia: "
        Leer radio
    Fin Si
    Según Sea opcion hacer 
        'A' o 'a':
            resultado<--2*PI*radio
            Escribir "La longitud de la circunferencia es ",resultado
        'B' 0 'b':
            resultado<--PI*radio**2
            Escribir "La superficie de la circunferencia es ",resultado
        'C' o 'c'
            resultado<--(4*PI*radio**3)/3
            Escribir "El volumen de la esfera es ",resultado
        'D' o 'd'
            resultado<--4*PI*radio**2
            Escribir "El área de la esfera es ",resultado
    Fin Según Sea
Fin Programa*/

/**
 *
 * @author Sergio Izquierdo Moreno
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        //Entorno:
        char opcion;
        float radio, resultado;
        final float PI = 3.1416F;
        //Algoritmo:
        radio = 0;
        do {
            System.out.println("A. Longitud de circunferencia.");
            System.out.println("B. Superficie de la circunferencia.");
            System.out.println("C. Volumen de la esfera.");
            System.out.println("D. Área de la esfera.");
            System.out.println("E. Salir.");
            System.out.print("Elija opción: ");
            opcion = Leer.datoChar();
        } while (opcion != 'A' && opcion != 'a' && opcion != 'B' && opcion != 'b' && opcion != 'c'
                && opcion != 'C' && opcion != 'd' && opcion != 'D' && opcion != 'E' && opcion != 'e');
        if (opcion != 'E' && opcion != 'e') {
            System.out.println("Introduzca el radio de la circunferencia");
            radio = Leer.datoFloat();
        }//Fin Si
        switch (opcion) {
            case 'A':
            case 'a':
                resultado = 2 * PI * radio;
                System.out.println("La longitud de la circunferencia es " + resultado);
                break;
            case 'B':
            case 'b':
                resultado = PI * (float) Math.pow(radio, 2);
                System.out.println("La superficie de la circunferencia es " + resultado);
                break;
            case 'C':
            case 'c':
                resultado = (4 * PI * (float) Math.pow(radio, 3)) / 3;
                System.out.println("El volumen de la esfera es " + resultado);
                break;
            case 'D':
            case 'd':
                resultado = 4 * PI * (float) Math.pow(radio, 2);
                System.out.println("El área de la esfera es " + resultado);
                break;
        }//Fin Según Sea


















    }//Fin Programa
}
