
/*Programa: LongitudYAreaDeCircunferencia
Autor: Sergio Izquierdo Moreno
Entorno:
    longitud es numérico real
    area es numérico real
    CONST PI es numérico real<--3.1416
    radio es numérico real
Algoritmo:
    Repetir
        Escribir "Introduzca el radio de la circunferencia en centrímetros que desea calcular: "
        Leer radio
        Si radio<0 entonces 
            Escribir "Error, introduce un radio mayor que 0"
        Fin Si
    Hasta radio>0
    longitud<--2*PI*radio
    area<--PI*radio**2
    Escribir "La longitud de la circunferencia calculada es ",longitud," y el area es ",area
Fin Programa*/

//Programa: LongitudYAreaDeCircunferencia
//Autor: Sergio Izquierdo Moreno
    public class Ejercicio2{
        public static void main(String[] args){
        //Entorno:
            float radio,longitud,area;
            final float PI=3.1416F;
        //Algoritmo:
            do{
                System.out.print("Introduzca el radio de la circunferencia que desea calcular: ");
                radio=Leer.datoFloat();
                if(radio<0){
                    System.out.print("Introduzca un radio positivo (mayor que 0)");
                }//Fin Si
            }while(radio<0);
            longitud=2*PI*radio;            
            area=PI*((float)Math.pow(radio,2));
            System.out.println("La longitud de la circunferencia calculada es "+longitud+" y el area es "+area);
        }//Fin Programa
    }