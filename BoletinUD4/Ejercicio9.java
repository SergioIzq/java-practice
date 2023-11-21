
/*Programa: SumaPares
Autor: Sergio Izquierdo Moreno
Entorno:
    i es numérico entero
    suma es numérico entero
Algortimo:
    Para i de 2 a 1000 con incremento 2 hacer
        suma<--suma+i
    Fin Para
    Escribir "La suma de todos los números pares entre 2 y 1000 es ",suma
Fin Programa*/


//Programa
//Autor:
public class Ejercicio9 {
    public static void main(String[] args){
    //Entorno:
        int i,suma;
    //Algoritmo
            suma=0;
        for(i=2;i<=1000;i=i+2){
            suma=suma+i;
        }//Fin Para
        System.out.println("La suma de todos los números pares entre 2 y 1000 es "+suma);
    }//Fin Programa
}
