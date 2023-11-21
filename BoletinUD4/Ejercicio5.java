
/*Programa: EdadEnDias
Autor: Sergio Izquierdo Moreno
Entorno:
    mes es numérico entero
    anio es numérico entero
    edadendias
Algoritmo:
    Repetir
        Escribir "Introduzca su mes de nacimiento: "
        Leer mes
        Si mes<=0 y mes>12 entonces
            Escribir "Error, introduzca un mes correcto"
        Fin Si
    Hasta mes>0 y mes<=12
    Escribir "Introduzca su año de nacimiento: "
    Leer anio
    edadendias<--mes*30+anio*360
    Escribir "Su edad en días es ",edadendias
Fin Programa*/

//Programa: EdadEnDias
//Autor: Sergio Izquierdo Moreno
    public class Ejercicio5{
        public static void main(String[] args){
        //Entorno:
            short mesShort;
            byte mesByte;
            int anio;
            int edadendias;
        //Algoritmo:
            do{
                System.out.print("Intrduzca su mes de nacimiento: ");
                mesShort=Leer.datoShort();
                mesByte=(byte)mesShort;
                if(mesByte<=0 || mesByte>12){
                   System.out.println("Error, introduzca un mes correcto");
                }//Fin Si
            }while(mesByte<0 || mesByte>=12);
            do{
            System.out.print("Introduzca su año de nacimiento: ");
            anio=Leer.datoInt();
            if(anio<1582){
                System.out.println("Error, introduzca una fecha superior a 1582 (calendario gregoriano)");
            }//Fin Si
            }while(anio<1582);
            edadendias=mesByte*30+anio*360;
            System.out.println("Su edad en días es "+edadendias);
        }//Fin Programa
    }