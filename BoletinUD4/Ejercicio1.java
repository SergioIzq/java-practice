/*Programa: AreaRectangulo
Autor: Sergio Izquierdo Moreno
Entorno: 
    area es numérico real
    base numérico real
    altura numérico real
Algoritmo:
    Repetir
        Escribir "Introduzca la base del rectángulo(mayor que 0), que desea calcular: "
        Leer base
        Si base<0 entonces hacer
            Escribir "Error, introduzca una base mayor que 0"
        Fin Si
    Hasta base>0
    Repetir
        Escribir "Introduzca la altura del rectángulo(mayor que 0), que desea calcular: "
        Leer altura
        Si altura<0 entonces 
            Escribir "Error, introduzca una altura mayor que 0"
        Fin Si
    Hasta altura>0
    area<--base*altura
    Escribir "El área del rectángulo introducido es ",area
Fin Programa*/



        
//Programa: AreaRectangulo
//Autor: Sergio Izquierdo Moreno
    public class Ejercicio1{
        public static void main(String[] args){
        //Entorno: 
           float area,base,altura;
        //Algoritmo:
           do{
               System.out.print("Introduzca la base del réctangulo(mayor que 0), del rectángulo que desea calcular: ");
               base=Leer.datoFloat();
           }while(base<0);
           do{
               System.out.print("Introduzca la altura del rectángulo(mayor que 0), del rectángulo que desea calcular: ");
               altura=Leer.datoFloat();
           }while(altura<0);
           area=base*altura;
          System.out.print("El área del rectangulo introducido es "+area); 
      }//Fin Programa
    }




 
 
 
 
 
 
 
 
 
 
 
 
 
