/*Programa: SumaSerieDeNumeros
Autor: Sergio Izquierdo Moreno
Entorno:         
    acum es numérico entero             
Algoritmo:
    Repetir 
        acum <— acum+3
        Escribir “, ” acum
    Hasta acum=99
Fin Programa*/

//Programa:
//Autor
public class Ejercicio11{
    public static void main(String[] args){
    //Entorno:
        byte acum;
    //Algoritmo:
        acum=3;
        System.out.print("3");
        do{
            acum=(byte) ((byte)acum+3);
            System.out.print(","+acum);
        }while(acum<=96);
        System.out.println();
    }//Fin Programa
}