/*Programa: Ejercicio20
Autor: Sergio Izquierdo Moreno
Entrono:
    anio es numérico entero
    esBisiesto es booleano
Algoritmo:
    esBisesto<--FALSO
    Repetir
        Escribir "Introduzca un año para saber si es bisiesto (año mayor o igual a 1582): "
        Leer anio
    Hasta anio>=1582
    Si ((anio%4=0) y ((anio%100 !=0) o (anio%400=0))) entonces
        esBisiesto<--VERDADERO
    Fin Si
    Si (esBisiesto) entonces
        Escribir "El año es bisiesto"
    Sino
        Escribir "El año no es bisiesto"
    Fin Si
Fin Programa*/

public class Ejercicio20 {
    public static void main(String []args){
    //Entorno:
        int anio;
        boolean esBisiesto;
    //Algoritmo:
        esBisiesto=false;
        do{
            System.out.println("Introduzca un año para saber si es bisiesto (año mayor o igual a 1582): ");
            anio=Leer.datoInt();
        }while(anio<1582);
        if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            esBisiesto=true;
        }//Fin Si
        if(esBisiesto){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
}//Fin Programa
}