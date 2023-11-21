
/*Programa: Numero1Al10
Autor: Sergio Izquierdo Moreno
Entorno:
    num es numérico real
Algoritmo:
    Repetir num<=1 y num>=10 hacer
        Escribir "Introduzca un número: "
        Leer num
    Hasta num>=1 y num<=10
Fin Programa*/


//Programa: Numero1Al10
//Autor: Sergio Izquierdo Moreno
public class Ejercicio8 {
    public static void main(String args[]){
    //Entorno:
        float num;
    //Algoritmo:
        do{
            System.out.print("Introduzca un número: ");
            num=Leer.datoFloat();
        }while(num<1 || num>10);
    }//Fin Programa
}

