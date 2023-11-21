
/*Programa: ConversionASegundos
Autor: Sergio Izquierdo Moreno
Entorno:
    horas es númerico entero
    minutos es numérico entero
    segundos es numérico real
    conversion es numérico real
Algoritmo:
    Repetir
        Escribir "Introduzca las horas que desea convertir en segundos: "
        Leer horas
        Si horas<0 entonces 
            Escribir "Error, introduzca un número de horas superior a 0"
        Fin Si
    Hasta horas>0
    Repetir
        Escribir "Introduzca los minutos que desea convertir en segundos: "
        Leer minutos
        Si minutos<0 entonces 
            Escribir "Error, introduzca un número de minutos superior a 0"
        Fin Si
    Hasta minutos>0
    Repetir
        Escribir "Introduzca los segundos: "
        Leer segundos
        Si segundos<0 entonces 
            Escribir "Error, introduzca un número de segundos superior a 0"
        Fin Si
    Hasta segundos>0
    horas<--horas*120
    minutos<--minutos*60
    conversion<--horas+minutos+segundos
    Escribir "El numero de horas, minutos y segundos introducidos convertidos a segundos es ",conversion
Fin Programa*/

//Programa: ConversionASegundos
//Autor: Sergio Izquierdo Moreno
public class Ejercicio3 {
    public static void main(String[] args){
    //Entorno:
        int horas, minutos;
        float segundos, conversion;
    //Algoritmo:
        do{
            System.out.print("Intrduzca las horas que desea convertir a segundos: ");
            horas=Leer.datoInt();
            if(horas<0){
                System.out.print("Error, introduzca un número de horas superior a 0");
            }//Fin Si
        }while(horas<0);
        do{
            System.out.print("Intrduzca los minutos que desea convertir a segundos: ");
            minutos=Leer.datoInt();
            if(minutos<0){
                System.out.print("Error, introduzca un número de minutos superior a 0");
            }//Fin Si
        }while(minutos<0);
        do{
            System.out.print("Intrduzca los segundos: ");
            segundos=Leer.datoInt();
            if(segundos<0){
                System.out.print("Error, introduzca un número de segundos superior a 0");
            }//Fin Si
        }while(segundos<0);
        horas=(horas*60)*60;
        minutos=minutos*60;
        conversion=horas+minutos+segundos;
        System.out.println("El numero de horas, minutos y segundos introducidos convertidos a segundos es "+conversion);
    }//Fin Programa
}

