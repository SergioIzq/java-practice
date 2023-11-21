/*Programa: FechaValida
Autor: Sergio Izquierdo Moreno
Entorno:
    dia es numérico entero
    mes es numérico entero
    anio es numérico entero
    esFechaValida es booleano
    esBisiesto es booleano
Algoritmo:
    esFechaValida<--VERDADERO 
    esBisiesto<--FALSO
    Escribir "Introduzca un año: "
    Leer anio
    Si anio <1582 entonces
        esFechaValida<--FALSO
    Fin Si
    Si (anio mod 4=0) y (anio mod 100 !=0) o (anio mod 400=0) entonces
        esBisiesto<--VERDADERO
    Fin Si
    Escribir "Introduzca un mes: "
    Leer mes
    Si mes<1 o mes>12 entonces
        esFechaValida<--FALSO
    Fin Si
    Según Sea mes hacer
        1 o 3 o 7 o 9 o 12:
            Escribir "Introduzca un día: "
            Leer dia
            Si dia<1 o dia>31 entonces
                esFechaValida<--FALSO
            Fin Si
        2:
            Escribir "Introduzca un día: "
            Leer dia
            Si esBisiesto entonces
                Si dia<1 o dia>29 entonces
                    esFechaValida<--FALSO
                Fin Si
            Sino
                Si dia<1 y dia>28
                    esFechaValida<--FALSO
                Fin Si
            Fin Si        
        4 o 5 o 6 o 8 o 10 o 11:
            Escribir "Introduzca un día: "
            Leer dia
            Si dia<1 o dia>30 entonces
                esFechaValida<--FALSO
            Fin Si              
        Sino
            esFechaValida<--FALSO
     Fin Según Sea
     Si esFechaValida entonces
        Escribir "La fecha introducida es correcta"
    Sino
        Escribir "La fecha introducida es incorrecta"
Fin Programa*/

//Programa:
//Autor:
public class Ejercicio22{
    public static void main(String[] args){
    //Entorno:
        int dia,mes,anio;
        boolean esBisiesto,esFechaValida;
    //Algoritmo:
        esFechaValida=true;
        esBisiesto=false;
        System.out.print("Introduzca un año: ");
        anio=Leer.datoInt();
        if(anio<1582){
            esFechaValida=false;
        }//Fin Si
        if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            esBisiesto=true;
        }//Fin Si
        System.out.println("Introduzca un mes: ");
        mes=Leer.datoInt();
        if(mes<1 || mes>12){
            esFechaValida=false;
        }//Fin Si
        switch(mes){
            case 1: case 3: case 7: case 9: case 12:
                System.out.println("Introduzca un día: ");
                dia=Leer.datoInt();
                if(dia<1 || dia>31){
                    esFechaValida=false;
                }//Fin Si
                break;
            case 2:
                System.out.println("Introduzca un día: ");
                dia=Leer.datoInt();
                if(esBisiesto){
                    if(dia<1 || dia>29){
                        esFechaValida=false;
                    }//Fin Si
                }else{
                    if(dia<1 || dia>28){
                        esFechaValida=false;
                    }//Fin Si
                }//Fin Si
                break;
            case 4: case 5: case 6: case 8: case 10: case 11:
                System.out.println("Introduzca un día: ");
                dia=Leer.datoInt();
                if(dia<1 || dia>30){
                    esFechaValida=false;
                }//Fin Si
                break;
            default:
                esFechaValida=false;
        }//Fin Según Sea
        if(esFechaValida){
            System.out.println("La fecha introducida es correcta");
        }else{
            System.out.println("La fecha introducida es incorrecta");
        }//Fin Si
    }//Fin Programa
}