/*Programa: TablaMultiplicar
Autor: Sergio Izquierdo Moreno
Entorno:
       tabla es numérico entero
       multiplicacion es numérico entero
       acum es numérico entero
       i es numérico entero
       
Programa:
       Repetir
              Escribir "Introduzca que tabla quiere saber: "
              Leer tabla
              Si tabla<1 o tabla >10 entonces hacer
                Escribir "Error, introduzca un número entre 1 y 10"
              Fin Si
      Hasta tabla>=1 o tabla <=10
      Para i 1 a 10 hacer
        multiplicacion<—tabla*(acum<--1+acum)
        Escribir tabla,"*",acum," = ",multiplicacion
      Fin Para                 
  Fin Programa*/


//Programa: TablaMultiplicar
//Autor: Sergio Izquierdo Moreno+
public class Ejercicio12{
    public static void main(String[] args){
    //Entorno:
        short tablaShort;
        byte tablaByte,i,multiplicacion,acum;
    //Algoritmo:
        acum=0;
        do{
            System.out.println("Introduzca la tabla que desea saber: ");
            tablaShort=Leer.datoShort();
            tablaByte=(byte)tablaShort;
            if(tablaByte<1 || tablaByte>10){
                System.out.println("Error, introduzca un número entre 1 y 10");
            }//Fin Si
        }while(tablaByte<1 || tablaByte>10);
                for(i=1;i<=10; i++){
                    multiplicacion=(byte)(tablaByte*(acum=(byte)(1+acum)));
                    System.out.println(tablaByte+"*"+acum+" = "+multiplicacion);
                }//Fin Para              
        }//Fin Según Sea    
    }//Fin Programa

