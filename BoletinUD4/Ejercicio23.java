/*Programa: FechaNumerica
Autor: Sergio Izquierdo Moreno
Entorno:
    fecha es numérico entero
    dia es numérico entero
    mes es numérico entero
    anio es numérico entero
    num es numérico entero
    i es numérico entero
    esBisiesto es booleano

Algoritmo:
    esBisiesto<--FALSO
    Repetir
        Escribir "Introduzca la fecha en forma numérica que desea saber: "
        Leer fecha
        Mientras n>=1 hacer
            num<--num/10
            i<--i+1
        Fin Mientras
    Hasta fecha>=0 y i=8
    dia<--fecha/10**6
    anio<--fecha mod 10**4
    mes<--fecha-dia*10**6-(anio mod 10**4)
    Si (anio mod 4=0) y (anio mod 100 !=0) o (anio mod 400=0) entonces
        esBisiesto<--VERDADERO
    Fin Si
    Según Sea mes hacer
        1:
            Si dia>=1 o dia<=31 entonces
                Escribir dia," de enero de ",anio
            Sino
            Escribir "Error, la fecha introducida no existe"
        Fin Si
        2:
            Si esBisiesto entonces
                Si dia<1 o dia>29 entonces
                    Escribir " Error, fecha inexistente"
                Sino
                    Escribir dia," de febrero de ",anio 
                Fin Si
            Sino
                Si dia<1 y dia>28
                    Escribir "Error, fecha inexistente"
                Sino
                    Escribir dia," de febrero de ",anio
            Fin Si
        3: 
            Si dia>=1 o dia<=31 entonces
                Escribir dia," de marzo de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        4:
            Si dia>=1 o dia<=30 entonces
                Escribir dia," de abril de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        5:
            Si dia>=1 o dia<=30 entonces
                Escribir dia," de mayo de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        6:
            Si dia>=1 o dia<=30 entonces
                Escribir dia," de junio de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        7:
            Si dia>=1 o dia<=31 entonces
                Escribir dia," de julio de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        8:
            Si dia>=1 o dia<=31 entonces
                Escribir dia" de agosto de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        9:
            Si dia>=1 o dia<=31 entonces
                Escribir dia" de septiembre de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        10:
            Si dia<1 o dia>30 entonces
                Escribir dia," de octubre de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        11:
            Si dia>=1 o dia<=30 entonces
                Escribir dia," de noviembre de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
        12: 
            Si dia>=1 o dia<=31 entonces
                Escribir dia," de diciembre de ",anio
            Sino
                Escribir "Error, la fecha introducida no existe"
            Fin Si
     Fin Según Sea
Fin Programa*/

//Programa: FechaNumerica
//Autor: Sergio Izquierdo Moreno
public class Ejercicio23{
    public static void main(String[] args){
//Entorno:        
    int fecha,dia,mes,anio,cantidadDigitos,i;
    boolean esBisiesto;
//Algoritmo:
    esBisiesto=false;
    i=0;
    do{
        System.out.println("Introduzca una fecha en forma numérica (ddmmaaaa): " );
        fecha=Leer.datoInt();
        cantidadDigitos=fecha;
        while(cantidadDigitos>=1){
            cantidadDigitos=cantidadDigitos/10;
            i++;
        }//Fin Mientras
    }while(i!=8);
    dia=fecha/(int)Math.pow(10, 6);
    anio=fecha%(int)Math.pow(10,4);
    mes=fecha-dia*(int)Math.pow(10,6)-anio%(int)Math.pow(10, 4);
    mes=mes/10000;
    if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
        esBisiesto=true;
    }//Fin Si
    switch(mes){
        case 1:
            if (dia >= 1 && dia <= 31) {
                System.out.println(dia+" de enero de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 2:
            if (esBisiesto) {
                if (dia >=1 && dia <=29) {
                    System.out.println(dia+" de febrero de "+anio);
                }else{
                    System.out.println("Error, fecha inexistente");
                }//Fin Si
            } else {
                if (dia >=1 && dia <=28) {
                    System.out.println(dia+" de febrero de "+anio);
                }else{
                   System.out.println("Error, fecha inexistente");
                }//Fin Si
            }//Fin Si
            break;
        case 3:
            if (dia >= 1 && dia <= 31) {
                System.out.print(dia+" de marzo de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 4:
            if (dia >= 1 && dia <= 30) {
                System.out.print(dia+" de abril de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 5:
            if (dia >= 1 && dia <= 30) {
                System.out.print(dia+" de mayo de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 6: 
            if (dia >= 1 && dia <= 30) {
                System.out.print(dia+" de junio de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
        break;
        case 7:
            if (dia >= 1 && dia <= 31) {
                System.out.print(dia+" de julio de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 8:
            if (dia >= 1 && dia <= 30) {
                System.out.print(dia+" de agosto de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 9:
            if (dia >= 1 && dia <= 31) {
                System.out.println(dia+" de septiembre de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 10:
            if (dia >= 1 && dia <= 30) {
                System.out.println(dia+" de octubre de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 11:
            if (dia >= 1 && dia <=30) {
                System.out.print(dia+" de noviembre de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        case 12:
            if (dia >= 1 && dia <= 31) {
                System.out.println(dia+" de diciembre de "+anio);
            }else{
                System.out.println("Error la fecha introducida no existe");
            }//Fin Si
            break;
        default:
            System.out.println("Error la fecha introducida no existe");
        }//Fin Según Sea
    }//Fin Programa
}