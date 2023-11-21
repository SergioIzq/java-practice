/*Programa: MostrarCienNumeros
Autor: Sergio Izquierdo Moreno
Entorno:
    i es numérico entero
    acum es numérico entero
    respuesta es alfanumérico
Algoritmo:
    i<--0
    Para i de i a 100
        acum<--acum+1
        Escribir acum
        Si i=19 o i=39 o i=59 o i=79 o i=99 entonces
            Escribir "Pulse una tecla para continuar: "
            Leer respuesta
        Fin Si
     Fin Para
Fin Programa*/

//Programa: MostrarCienNumeros
//Autor: Sergio Izquierdo Moreno
public class Ejercicio25{
    public static void main(String[] args){
    //Entorno:
        int acum,i;
        char respuesta;
    //Algoritmo:
        acum=0;
        for(i=0;i<=99;i++){
            acum=acum+1;
            System.out.println(acum);
            if(i==19 || i==39 || i==59 || i==79 || i==99){
                System.out.println("Pulse una tecla para continuar: ");
                respuesta=Leer.datoChar();
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}