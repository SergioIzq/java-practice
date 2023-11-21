
/*Programa: HoraDelDia
Autor: Sergio Izquierdo Moreno
Entorno:
    hora es numérico entero
Algoritmo:
    Repetir
        Escribir "Introduzca la hora del día"
        Leer hora
        Si hora<0 entonces  
            Escribir "Error, introduzca una hora positiva"
        Fin Si
    Hasta hora>=0
    Si hora<=12 entonces 
        Escribir "Buenos Días"
    Sino
        Si hora>=13 y hora<=18 entonces 
            Escribir "Buenas tardes"
        Sino
            Si hora>18 y hora<=24 entonces 
                Escribir "Buenas noches"
        Fin Si
        Sino
            Escribir "Hora fuera de rango"
            Fin Si
Fin Programa*/


//Programa: HoraDelDia
//Autor: Sergio Izquierdo Moreno
    public class Ejercicio6{
        public static void main(String[] args){
        //Entorno:
            byte horaByte;
            short horaShort;
        //Algoritmo:
            do{
                System.out.print("Introduzca la hora del día: ");
                horaShort=Leer.datoShort();
                horaByte=(byte)horaShort;
                if(horaByte<0){
                    System.out.println("Error, introduzca una hora positiva");
                }//Fin Si
            }while(horaByte<0);
            if(horaByte<=12){
                System.out.println("Buenos días");
            }else{
                if(horaByte>=13 && horaByte<=18){
                    System.out.println("Buenas tardes");
                }else{
                    if(horaByte>18 && horaByte<=24){
                        System.out.println("Buenas noches");
                    }else{
                            System.out.println("Hora fuera de rango");
                    }//Fin Si
                }//Fin Si
                
            }//Fin Si
        }//Fin Programa
    }